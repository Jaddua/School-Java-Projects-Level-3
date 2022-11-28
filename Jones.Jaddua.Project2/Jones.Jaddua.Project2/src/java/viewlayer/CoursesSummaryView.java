/* File: CoursesSummaryView.java
 * Author: Jaddua Jones    040898457    
 */

package viewlayer;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businesslayer.CoursesBusinessLogic;
import transferobjects.CourseDTO;
import transferobjects.CredentialsDTO;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class CoursesSummaryView extends HttpServlet {
    
    private CredentialsDTO credentials = new CredentialsDTO();

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Courses Summary View</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Courses Summary View at " + request.getContextPath() + "</h1>");
          
            credentials.setUsername(request.getParameter("username"));
            credentials.setPassword(request.getParameter("password"));
            
            CoursesBusinessLogic logic = new CoursesBusinessLogic(credentials);
            List<CourseDTO> courses = logic.getAllCourses();
            out.println("<table border=\"1\">");
            out.println("<tr>");
            out.println("<td>Course Code</td>");
            out.println("<td>Course Name</td>");
            out.println("<td>Course Description</td>");
            out.println("</tr>");
            for(CourseDTO course : courses){
                out.printf("<tr><td>%s</td><td>%s</td><td>%s</td></tr>",
                    course.getCourseCode(), course.getCourseName(), course.getCourseDescription());
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
