/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2019-07-28 09:46:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>www.CarrierMithr.com</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".body {\n");
      out.write("        margin:0%;\n");
      out.write("}\n");
      out.write("a:link {\n");
      out.write("\tcolor: #000066;\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("}\n");
      out.write("a:visited {\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("\tcolor: #C0DCC0;\n");
      out.write("}\n");
      out.write("a:hover {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor: #996666;\n");
      out.write("}\n");
      out.write("a:active {\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("\tcolor: #FF9999;\n");
      out.write("}\n");
      out.write(".style4 {\n");
      out.write("\tcolor: #DDCCDD;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write(".style7 {color: #EFDAEB}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("<body style=\"margin:0px\" bgcolor=\"#4E2B21\">\n");
      out.write("<table width=\"100%\" height=\"707\" border=\"1\" valign=\"top\" >\n");
      out.write("  <tr>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"1\" height=\"621\" bgcolor=\"#624631\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.html", out, false);
      out.write("</td>\n");
      out.write("    <td width=\"593\" valign=\"top\" bgcolor=\"#FFFFFF\"><img src=\"fgi_recruitment_home[1].jpg\" width=\"540\" height=\"357\">    </td>\n");
      out.write("    <td width=\"130\" height=\"621\" bgcolor=\"#624631\">\n");
      out.write("    <div class=\"style4\"><marquee behavior=\"scroll\" direction=\"up\" scrolldelay=\"30sec\">\n");
      out.write("    <span class=\"style7\">Deck your hearts with lights of Success...Sure!! that you will reach your destiny</span>\n");
      out.write("    </marquee>\n");
      out.write("    </div>    </td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
