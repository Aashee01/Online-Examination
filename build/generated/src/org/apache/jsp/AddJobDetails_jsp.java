package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddJobDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            <!--\n");
      out.write("            .style1 {\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #993300;\n");
      out.write("            }\n");
      out.write("            .style2 {\n");
      out.write("                color: #000000;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            -->\n");
      out.write("        </style>\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("            function check()\n");
      out.write("            {\n");
      out.write("\t\t\t\tvar a= document.form1.jobid.value;\n");
      out.write("\t\t\t\tvar b= document.form1.vacancies.value;\n");
      out.write("\t\t\t\tvar c= document.form1.salary.value;\n");
      out.write("\n");
      out.write("                if(document.form1.jobid.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter Job Id\");\n");
      out.write("                    document.form1.jobid.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\t\t\t\telse if(!parseInt(a))\n");
      out.write("            \t{\n");
      out.write("                alert(\"Enter integer\");\n");
      out.write("                document.form1.jobid.focus();\n");
      out.write("                return false;\n");
      out.write("            \t}\n");
      out.write("\n");
      out.write("                if(document.form1.post.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter Post\");\n");
      out.write("                    document.form1.post.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.criteria.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter Criteria\");\n");
      out.write("                    document.form1.criteria.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.form1.vacancies.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter no: of Vacancies available\");\n");
      out.write("                    document.form1.vacancies.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\t\t\t\telse if(!parseInt(b))\n");
      out.write("            \t{\n");
      out.write("                alert(\"Enter integer\");\n");
      out.write("                document.form1.vacancies.focus();\n");
      out.write("                return false;\n");
      out.write("            \t}\n");
      out.write("                if(document.form1.salary.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter Salary\");\n");
      out.write("                    document.form1.salary.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\t\t\t\telse if(!parseInt(c))\n");
      out.write("            \t{\n");
      out.write("                alert(\"Enter integer\");\n");
      out.write("                document.form1.salary.focus();\n");
      out.write("                return false;\n");
      out.write("            \t}\n");
      out.write("                if(document.form1.lastdate.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter Last Date\");\n");
      out.write("                    document.form1.lastdate.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin:0px\" bgcolor=\"#FFFFFF\">\n");
      out.write("        <table width=\"100%\" border=\"1\" bgcolor=\"#FFFFFF\">\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"107\" colspan=\"2\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CompanyHeader.jsp", out, false);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"1\" height=\"512\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Companymenu.html", out, false);
      out.write("</td>\n");
      out.write("                <td width=\"961\" bgcolor=\"#6699CC\">\n");
      out.write("                    <form name=\"form1\" method=\"post\" action=\"savejobdetails.jsp\">\n");
      out.write("                        <table width=\"517\" height=\"334\" border=\"1\" align=\"center\" bgcolor=\"#FFCCCC\">\n");
      out.write("                            <tr bordercolor=\"#0099FF\">\n");
      out.write("                                <td height=\"30\" colspan=\"2\" bgcolor=\"#E3EAF4\"><div align=\"center\" class=\"style1\">Job Description </div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td width=\"160\" height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\">JobID</div></td>\n");
      out.write("                                <td width=\"213\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\">\n");
      out.write("                                    <label>\n");
      out.write("                                        <input name=\"jobid\" id=\"jobid\"type=\"text\" size=\"30\">\n");
      out.write("                                </label>            </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\"> Name of Post </div></td>\n");
      out.write("                                <td bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><input name=\"post\" name=\"post\" type=\"text\" size=\"30\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\">Criteria</div></td>\n");
      out.write("                                <td bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><input name=\"criteria\" name=\"criteria\" type=\"text\" size=\"30\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\">No: of Vacancies </div></td>\n");
      out.write("                                <td bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><input name=\"vacancies\" name=\"vacancies\" type=\"text\" size=\"30\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\">Salary/Annum</div></td>\n");
      out.write("                                <td bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><input name=\"salary\" name=\"salary\" type=\"text\" size=\"30\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\">Last Date<font color=\"red\">&nbsp;&nbsp;(dd/mm/yy) </font></div></td>\n");
      out.write("                                <td bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><input name=\"lastdate\" name=\"lastdate\" type=\"text\" size=\"30\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr bordercolor=\"#0099FF\">\n");
      out.write("                                <td height=\"28\" colspan=\"2\" bgcolor=\"#E3EAF4\">\n");
      out.write("                                    <div align=\"center\">\n");
      out.write("                                        <input type=\"submit\" name=\"Submit\" value=\"Submit\" onClick=\"return check()\">\n");
      out.write("                                </div>           </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                    <h2>&nbsp;</h2>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
