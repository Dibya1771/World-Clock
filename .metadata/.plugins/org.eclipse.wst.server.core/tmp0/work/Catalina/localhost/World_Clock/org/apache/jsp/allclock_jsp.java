/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-09-05 18:46:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class allclock_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<htmL>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>All clock</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/allclock.css\" />\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <nav class=\"navbar\">\r\n");
      out.write("      <h2>Current Local Times Around The World</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"index.jsp\"><< Back to home</a></li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <span><a href=\"logout\">Logout</a></span>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div id=\"country\">\r\n");
      out.write("      <button class=\"btn1\">Click Any Continent Name >></button>\r\n");
      out.write("\r\n");
      out.write("      <a href=\"#Asia\"><button class=\"btn\">Asia</button></a>\r\n");
      out.write("      <a href=\"#Africa\"><button class=\"btn\">Africa</button></a>\r\n");
      out.write("      <a href=\"#North\"><button class=\"btn\">North America</button></a>\r\n");
      out.write("      <a href=\"#South\"><button class=\"btn\">South America</button></a>\r\n");
      out.write("      <a href=\"#Antarctica\"><button class=\"btn\">Antarctica</button></a>\r\n");
      out.write("      <a href=\"#Europe\"><button class=\"btn\">Europe</button></a>\r\n");
      out.write("      <a href=\"#Australia\"><button class=\"btn\">Australia</button></a>\r\n");
      out.write("\r\n");
      out.write("      <button class=\"btn1\"><< Click Any Continent Name</button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <section id=\"Asia\">\r\n");
      out.write("        <h4>Asia Time</h4>\r\n");
      out.write("\r\n");
      out.write("        <!-- 1 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>India</h1>\r\n");
      out.write("          <p id=\"indiatime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 2 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Dubai</h1>\r\n");
      out.write("          <p id=\"dubaitime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 3 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Bangkok</h1>\r\n");
      out.write("          <p id=\"bangkoktime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 4 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Singapore</h1>\r\n");
      out.write("          <p id=\"singaporetime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 5 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Tokyo</h1>\r\n");
      out.write("          <p id=\"tokyotime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 6 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Chagos</h1>\r\n");
      out.write("          <p id=\"chagostime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 7 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Hong_Kong</h1>\r\n");
      out.write("          <p id=\"kongtime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <section id=\"Africa\">\r\n");
      out.write("        <h4>Africa Time</h4>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Sao_Tome</h1>\r\n");
      out.write("          <p id=\"sao_tometime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Algiers</h1>\r\n");
      out.write("          <p id=\"algierstime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Accra</h1>\r\n");
      out.write("          <p id=\"accratime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Cairo</h1>\r\n");
      out.write("          <p id=\"cairotime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Bissau</h1>\r\n");
      out.write("          <p id=\"bissautime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Nairobi</h1>\r\n");
      out.write("          <p id=\"nairobitime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Juba</h1>\r\n");
      out.write("          <p id=\"jubatime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <section id=\"North\">\r\n");
      out.write("        <h4>North America Time</h4>\r\n");
      out.write("\r\n");
      out.write("        <!-- 1 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Goose_Bay</h1>\r\n");
      out.write("          <p id=\"baytime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 2 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Belize</h1>\r\n");
      out.write("          <p id=\"belizetime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 3 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>New_York</h1>\r\n");
      out.write("          <p id=\"yorktime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 4 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Mexico_City</h1>\r\n");
      out.write("          <p id=\"mexicotime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 5 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Phoenix</h1>\r\n");
      out.write("          <p id=\"phoenixtime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 6 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Merida</h1>\r\n");
      out.write("          <p id=\"meridatime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 7 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Chicago</h1>\r\n");
      out.write("          <p id=\"chicagotime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <section id=\"South\">\r\n");
      out.write("        <h4>South America Time</h4>\r\n");
      out.write("\r\n");
      out.write("        <!-- 1 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Buenos_Aires</h1>\r\n");
      out.write("          <p id=\"buenostime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 2 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Argentina/Salta</h1>\r\n");
      out.write("          <p id=\"saltatime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 3 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>La_Paz</h1>\r\n");
      out.write("          <p id=\"laaztime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 4 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Maceio</h1>\r\n");
      out.write("          <p id=\"maceiotime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 5 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Manaus</h1>\r\n");
      out.write("          <p id=\"manaustime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 6 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Campo_Grande</h1>\r\n");
      out.write("          <p id=\"campotime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 7 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Sao_Paulo</h1>\r\n");
      out.write("          <p id=\"saotime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <section id=\"Antarctica\">\r\n");
      out.write("        <h4>Antarctica Time</h4>\r\n");
      out.write("\r\n");
      out.write("        <!-- 1 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Casey</h1>\r\n");
      out.write("          <p id=\"caseytime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 2 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Davis</h1>\r\n");
      out.write("          <p id=\"davistime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 3 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Macquarie</h1>\r\n");
      out.write("          <p id=\"macquarietime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 4 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Mawson</h1>\r\n");
      out.write("          <p id=\"mawsonetime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 5 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Syowa</h1>\r\n");
      out.write("          <p id=\"syowatime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 6 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Troll</h1>\r\n");
      out.write("          <p id=\"trolltime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 7 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Vostok</h1>\r\n");
      out.write("          <p id=\"vostoktime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <section id=\"Europe\">\r\n");
      out.write("        <h4>Europe Time</h4>\r\n");
      out.write("\r\n");
      out.write("        <!-- 1 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Paris</h1>\r\n");
      out.write("          <p id=\"paristime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 2 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>London</h1>\r\n");
      out.write("          <p id=\"londontime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 3 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Athens</h1>\r\n");
      out.write("          <p id=\"athenstime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 4 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Sofia</h1>\r\n");
      out.write("          <p id=\"sofiatime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 5 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Berlin</h1>\r\n");
      out.write("          <p id=\"berlintime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 6 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Tallinn</h1>\r\n");
      out.write("          <p id=\"tallinntime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 7 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Moscow</h1>\r\n");
      out.write("          <p id=\"moscowtime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <section id=\"Australia\">\r\n");
      out.write("        <h4>Australia Time</h4>\r\n");
      out.write("\r\n");
      out.write("        <!-- 1 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Sydney</h1>\r\n");
      out.write("          <p id=\"sydneytime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 2 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Lord_Howe</h1>\r\n");
      out.write("          <p id=\"lordHowetime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 3 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Hobart</h1>\r\n");
      out.write("          <p id=\"hobarttime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 4 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Broken_Hill</h1>\r\n");
      out.write("          <p id=\"broken_Hilltime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 5 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Lindeman</h1>\r\n");
      out.write("          <p id=\"lindemantime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 6 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Eucla</h1>\r\n");
      out.write("          <p id=\"Euclatime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 7 -->\r\n");
      out.write("        <div class=\"timebox\">\r\n");
      out.write("          <h1>Darwin</h1>\r\n");
      out.write("          <p id=\"darwintime\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"country\">\r\n");
      out.write("      <button class=\"btn2\">Click Any Continent Name >></button>\r\n");
      out.write("\r\n");
      out.write("      <a href=\"#Asia\"><button class=\"btn2\">Asia</button></a>\r\n");
      out.write("      <a href=\"#Africa\"><button class=\"btn2\">Africa</button></a>\r\n");
      out.write("      <a href=\"#North\"><button class=\"btn2\">North America</button></a>\r\n");
      out.write("      <a href=\"#South\"><button class=\"btn2\">South America</button></a>\r\n");
      out.write("      <a href=\"#Antarctica\"><button class=\"btn2\">Antarctica</button></a>\r\n");
      out.write("      <a href=\"#Europe\"><button class=\"btn2\">Europe</button></a>\r\n");
      out.write("      <a href=\"#Australia\"><button class=\"btn2\">Australia</button></a>\r\n");
      out.write("\r\n");
      out.write("      <button class=\"btn2\"><< Click Any Continent Name</button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/allclock.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</htmL>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
