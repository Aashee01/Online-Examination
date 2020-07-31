
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;

public final class CompanyReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>www.CarrierMithr.com</title>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        <!--\n");
      out.write("        .body {\n");
      out.write("            margin:0%;\n");
      out.write("        }\n");
      out.write("        a:link {\n");
      out.write("            color: #000066;\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("        a:visited {\n");
      out.write("            text-decoration: underline;\n");
      out.write("            color: #C0DCC0;\n");
      out.write("        }\n");
      out.write("        a:hover {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #996666;\n");
      out.write("        }\n");
      out.write("        a:active {\n");
      out.write("            text-decoration: underline;\n");
      out.write("            color: #FF9999;\n");
      out.write("        }\n");
      out.write("        .style4 {\n");
      out.write("            color: #CC3333;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .style5 {color: #006699}\n");
      out.write("        -->\n");
      out.write("    </style>\n");
      out.write("    <script language=\"javascript\">\n");
      out.write("        function valid()\n");
      out.write("        {\n");
      out.write("            var a=document.form1.comname.value;\n");
      out.write("            var b=document.form1.compassword.value;\n");
      out.write("            var c=document.form1.comemail.value;\n");
      out.write("            var d=document.form1.comcontact.value;\n");
      out.write("            var e=document.form1.comcutoff.value;\n");
      out.write("            if(document.form1.comname.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Name\");\n");
      out.write("                document.form1.comname.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(parseInt(a))\n");
      out.write("            {\n");
      out.write("                alert(\"Company Name cannot be integer\");\n");
      out.write("                document.form1.comname.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comaddress.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Address\");\n");
      out.write("                document.form1.comaddress.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.compost.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Post\");\n");
      out.write("                document.form1.compost.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comcriteria.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Criteria\");\n");
      out.write("                document.form1.comcriteria.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comusername.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Username\");\n");
      out.write("                document.form1.comusername.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.compassword.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Password\");\n");
      out.write("                document.form1.compassword.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(b.length<8)\n");
      out.write("            {\n");
      out.write("                alert(\"Password should be minimum 8 characters\");\n");
      out.write("                document.form1.compassword.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comemail.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Email\");\n");
      out.write("                document.form1.comemail.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(c.indexOf('@')==-1)\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Email Correctly\");\n");
      out.write("                document.form1.comemail.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(c.indexOf('.')==-1)\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Email Correctly\");\n");
      out.write("                document.form1.comemail.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comcontact.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Contact no:\");\n");
      out.write("                document.form1.comcontact.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(!parseInt(d))\n");
      out.write("            {\n");
      out.write("                alert(\"Enter integer\");\n");
      out.write("                document.form1.comcontact.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(((document.form1.comcontact.value.length)<6) || ((document.form1.comcontact.value.length)>11))\n");
      out.write("            {\n");
      out.write("                alert(\"Phone no should contain atleast 6 integers \");\n");
      out.write("                document.form1.comcontact.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if(document.form1.comcutoff.value==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"Enter Company Cutoff\");\n");
      out.write("                document.form1.comcutoff.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(!parseInt(e))\n");
      out.write("            {\n");
      out.write("                alert(\"Enter integer\");\n");
      out.write("                document.form1.comcutoff.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            else if(parseInt(e)<0||parseInt(e)>100)\n");
      out.write("            {\n");
      out.write("                alert(\"Enter cutoff in %\");\n");
      out.write("                document.form1.comcutoff.focus();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            return true;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"margin:0px\">\n");
      out.write("    <table width=\"100%\" height=\"390\" border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <td height=\"28\" colspan=\"2\" bgcolor=\"#624631\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td width=\"7\" height=\"354\" valign=\"top\" bgcolor=\"#624631\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.html", out, false);
      out.write("</td>\n");
      out.write("            <td width=\"99%\" bgcolor=\"#F2DFE2\" valign=\"top\">\n");
      out.write("                <div class=\"Reg\" align=\"center\">\n");
      out.write("                    <form action=\"savecompanydata.jsp\" method=\"post\" name=\"form1\" id=\"form1\">\n");
      out.write("                        <table width =85% border=0 cellpadding=3 cellspacing=0 bordercolor=\"#FFFFFF\" >\n");
      out.write("                            <tr bgcolor=\"\" width=100%>\n");
      out.write("                                <td colspan=\"2\" bgcolor=\"#F2DFE2\"> <div align=\"left\" class=\"style4\">\n");
      out.write("                                        <div align=\"center\" class=\"style5\">Company Registration </div>\n");
      out.write("                                </div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr bgcolor=\"\" width=100%>\n");
      out.write("                                <td width=\"33%\" bgcolor=\"#FFFFFF\"><div align=\"left\"><font SIZE=\"2\" COLOR=\"black\" face =arial >Name</font></div></td>\n");
      out.write("                                <td width=\"67%\" bgcolor=\"#FFFFFF\"><div align=\"left\">\n");
      out.write("                                        <input TYPE=\"text\" NAME=\"comname\" id=\"comname\" size=30 maxlength=30>\n");
      out.write("                                </div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr bgcolor =#FEF7E9>\n");
      out.write("                                <td bgcolor=\"#E6F0F0\"><div align=\"left\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Address</font></div></td>\n");
      out.write("                                <td bgcolor=\"#E6F0F0\"><div align=\"left\">\n");
      out.write("                                        <input NAME=\"comaddress\" TYPE=\"text\" id=\"comaddress\" size=30 maxlength=50>\n");
      out.write("                                </div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr bgcolor =#FEF7E9>\n");
      out.write("                                <td bgcolor=\"#F2DFE2\"><div align=\"left\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Post</font></div></td>\n");
      out.write("                                <td bgcolor=\"#F2DFE2\"><div align=\"left\">\n");
      out.write("                                        <input NAME=\"compost\" TYPE=\"text\" id=\"compost\" size=30  maxlength=50>\n");
      out.write("                                </div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr bgcolor =#FEF7E9>\n");
      out.write("                                <td bgcolor=\"#F2DFE2\"><div align=\"left\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Criteria</font></div></td>\n");
      out.write("                                <td bgcolor=\"#F2DFE2\"><div align=\"left\">\n");
      out.write("                                        <input NAME=\"comcriteria\" TYPE=\"text\" id=\"comcriteria\" size=30  maxlength=50>\n");
      out.write("                                </div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr  wdth =100%>\n");
      out.write("                                <td bgcolor=\"#FFFFFF\"><div align=\"left\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Username</font></div></td>\n");
      out.write("                                <td bgcolor=\"#FFFFFF\"><div align=\"left\">\n");
      out.write("                                        <input TYPE=\"text\" NAME=\"comusername\" id=\"comusername\"size=30 maxlength=30 value=''>\n");
      out.write("                                </div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr  wdth =100%>\n");
      out.write("                                <td bgcolor=\"#E6F0F0\"><div align=\"left\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Password</font></div></td>\n");
      out.write("                                <td bgcolor=\"#E6F0F0\"><div align=\"left\">\n");
      out.write("                                        <input TYPE=\"password\" NAME=\"compassword\" id=\"compassword\" size=32 maxlength=30 value=''>\n");
      out.write("                                </div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr  bgcolor =#FEF7E9>\n");
      out.write("                                <td bgcolor=\"#F2DFE2\"><div align=\"left\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Email_id</font></div></td>\n");
      out.write("                                <td bgcolor=\"#F2DFE2\"><div align=\"left\">\n");
      out.write("                                        <input TYPE=\"text\" NAME=\"comemail\" id=\"comemail\" size=30 maxlength=30 value=''>\n");
      out.write("                                </div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td bgcolor=\"#FFFFFF\"><div align=\"left\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Contact No:</font></div></td>\n");
      out.write("                                <td bgcolor=\"#FFFFFF\"><div align=\"left\">\n");
      out.write("                                        <input TYPE=\"text\" NAME=\"comcontact\" id=\"comcontact\" size=10 maxlength=30 >\n");
      out.write("                                &nbsp; <font SIZE=\"2\" COLOR=\"#CC0000\" face =arial>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(STD-No.)</font></div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr  bgcolor =#FEF7E9>\n");
      out.write("                                <td bgcolor=\"#E6F0F0\"><div align=\"left\"><font SIZE=\"2\" COLOR=\"black\" face =arial>CutOff %</font></div></td>\n");
      out.write("                                <td bgcolor=\"#E6F0F0\"><div align=\"left\">\n");
      out.write("                                        <input TYPE=\"text\" NAME=\"comcutoff\" id=\"comcutoff\" size=30 maxlength=30 value=''>\n");
      out.write("                                </div></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td height=\"51\" colspan=2 bgcolor=\"#F2DFE2\" ><div align=\"center\"><br>\n");
      out.write("                                        <input TYPE=\"reset\"> &nbsp;&nbsp;<input TYPE=\"submit\" value=\"Submit\" onclick=\"return valid()\">\n");
      out.write("                                </div>                                 </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</body>");
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
