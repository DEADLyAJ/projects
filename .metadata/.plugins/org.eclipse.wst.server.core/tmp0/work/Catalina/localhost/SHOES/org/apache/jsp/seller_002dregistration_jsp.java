/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-06-21 12:08:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class seller_002dregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Bootie Ecommerce Bootstrap Responsive Web Template | Contact :: W3layouts</title>\r\n");
      out.write("    <!-- Meta tag Keywords -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"keywords\" content=\"Bootie Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("    <script>\r\n");
      out.write("        addEventListener(\"load\", function() {\r\n");
      out.write("            setTimeout(hideURLbar, 0);\r\n");
      out.write("        }, false);\r\n");
      out.write("\r\n");
      out.write("        function hideURLbar() {\r\n");
      out.write("            window.scrollTo(0, 1);\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- //Meta tag Keywords -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom-Files -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("    <!-- Bootstrap-Core-CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("    <!-- Style-CSS -->\r\n");
      out.write("    <!-- font-awesome-icons -->\r\n");
      out.write("    <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- //font-awesome-icons -->\r\n");
      out.write("    <!-- /Fonts -->\r\n");
      out.write("    <link href=\"//fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"//fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- //Fonts -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!-- mian-content -->\r\n");
      out.write("    <div class=\"main-banner inner\" id=\"home\">\r\n");
      out.write("        <!-- header -->\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <div class=\"container-fluid px-lg-5\">\r\n");
      out.write("                <!-- nav -->\r\n");
      out.write("                <nav class=\"py-4\">\r\n");
      out.write("                    <div id=\"logo\">\r\n");
      out.write("                        <h1> <a href=\"index.html\"><span class=\"fa fa-bold\" aria-hidden=\"true\"></span>ootie</a></h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <label for=\"drop\" class=\"toggle\">Menu</label>\r\n");
      out.write("                    <input type=\"checkbox\" id=\"drop\" />\r\n");
      out.write("                    <ul class=\"menu mt-2\">\r\n");
      out.write("                        <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"about.html\">About</a></li>\r\n");
      out.write("                        <li><a href=\"blog.html\">Blog</a></li>\r\n");
      out.write("                        <li class=\"active\"><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <!-- //nav -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- //header -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--//main-content-->\r\n");
      out.write("    <!---->\r\n");
      out.write("    <ol class=\"breadcrumb\">\r\n");
      out.write("        <li class=\"breadcrumb-item\">\r\n");
      out.write("            <a href=\"index.html\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"breadcrumb-item active\">Seller Registration</li>\r\n");
      out.write("    </ol>\r\n");
      out.write("    <!---->\r\n");
      out.write("    <!--// mian-content -->\r\n");
      out.write("    <!-- banner -->\r\n");
      out.write("    <section class=\"ab-info-main py-5\">\r\n");
      out.write("        <div class=\"container py-3\">\r\n");
      out.write("            <h3 class=\"tittle text-center\"><span class=\"sub-tittle\">Find Us</span>Seller Registration</h3>\r\n");
      out.write("            <div class=\"row contact-main-info mt-5\">\r\n");
      out.write("                <div class=\"col-md-6 contact-right-content\">\r\n");
      out.write("                    <form action=\"SellerController\" method=\"post\">\r\n");
      out.write("                        <input type=\"text\" name=\"name\" placeholder=\"Name\" required=\"\">\r\n");
      out.write("                        <input type=\"text\" name=\"contact\" placeholder=\"Phone\" required=\"\">\r\n");
      out.write("                        <input type=\"text\" name=\"address\" placeholder=\"Address\" required=\"\">\r\n");
      out.write("                        <input type=\"text\" name=\"pincode\" placeholder=\"Pincode\" required=\"\">\r\n");
      out.write("                        <input type=\"email\" class=\"email\" name=\"email\" placeholder=\"Email\" required=\"\">\r\n");
      out.write("                        <input type=\"text\" name=\"password\" placeholder=\"Password\" required=\"\">\r\n");
      out.write("                        <div class=\"read mt-3\">\r\n");
      out.write("                            <input type=\"submit\" value=\"register\" name=\"action\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6 contact-left-content\">\r\n");
      out.write("                    <div class=\"address-con\">\r\n");
      out.write("                        <h4 class=\"mb-2\"><span class=\"fa fa-phone-square\" aria-hidden=\"true\"></span> Phone</h4>\r\n");
      out.write("                        <p>+121 098 8907 9987</p>\r\n");
      out.write("                        <p>+121 098 8907 9987</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"address-con my-4\">\r\n");
      out.write("                        <h4 class=\"mb-2\"><span class=\"fa fa-envelope-o\" aria-hidden=\"true\"></span> Email </h4>\r\n");
      out.write("                        <p><a href=\"mailto:info@example.com\">info@example.com</a></p>\r\n");
      out.write("                        <p><a href=\"mailto:info@example.com\">info@example.com</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"address-con mb-4\">\r\n");
      out.write("                        <h4 class=\"mb-2\"><span class=\"fa fa-fax\" aria-hidden=\"true\"></span> Fax</h4>\r\n");
      out.write("\r\n");
      out.write("                        <p>(800) 123-80088</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"address-con\">\r\n");
      out.write("                        <h4 class=\"mb-2\"><span class=\"fa fa-map-marker\" aria-hidden=\"true\"></span> Location </h4>\r\n");
      out.write("\r\n");
      out.write("                        <p>Honey Avenue, New York City</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"map-fo mt-lg-5 mt-4\">\r\n");
      out.write("                <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d423286.27404345275!2d-118.69191921441556!3d34.02016130939095!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x80c2c75ddc27da13%3A0xe22fdf6f254608f4!2sLos+Angeles%2C+CA%2C+USA!5e0!3m2!1sen!2sin!4v1522474296007\" allowfullscreen></iframe>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- //contact -->\r\n");
      out.write("    <!-- footer -->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row footer-top\">\r\n");
      out.write("                <div class=\"col-lg-4 footer-grid_section_w3layouts\">\r\n");
      out.write("                    <h2 class=\"logo-2 mb-lg-4 mb-3\">\r\n");
      out.write("                        <a href=\"index.html\"><span class=\"fa fa-bold\" aria-hidden=\"true\"></span>ootie</a>\r\n");
      out.write("                    </h2>\r\n");
      out.write("                    <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\r\n");
      out.write("                    <h4 class=\"sub-con-fo ad-info my-4\">Catch on Social</h4>\r\n");
      out.write("                    <ul class=\"w3layouts_social_list list-unstyled\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" class=\"w3pvt_facebook\">\r\n");
      out.write("                                <span class=\"fa fa-facebook-f\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"mx-2\">\r\n");
      out.write("                            <a href=\"#\" class=\"w3pvt_twitter\">\r\n");
      out.write("                                <span class=\"fa fa-twitter\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" class=\"w3pvt_dribble\">\r\n");
      out.write("                                <span class=\"fa fa-dribbble\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"ml-2\">\r\n");
      out.write("                            <a href=\"#\" class=\"w3pvt_google\">\r\n");
      out.write("                                <span class=\"fa fa-google-plus\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-8 footer-right\">\r\n");
      out.write("                    <div class=\"w3layouts-news-letter\">\r\n");
      out.write("                        <h3 class=\"footer-title text-uppercase text-wh mb-lg-4 mb-3\">Newsletter</h3>\r\n");
      out.write("\r\n");
      out.write("                        <p>By subscribing to our mailing list you will always get latest news and updates from us.</p>\r\n");
      out.write("                        <form action=\"#\" method=\"post\" class=\"w3layouts-newsletter\">\r\n");
      out.write("                            <input type=\"email\" name=\"Email\" placeholder=\"Enter your email...\" required=\"\">\r\n");
      out.write("                            <button class=\"btn1\"><span class=\"fa fa-paper-plane-o\" aria-hidden=\"true\"></span></button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row mt-lg-4 bottom-w3layouts-sec-nav mx-0\">\r\n");
      out.write("                        <div class=\"col-md-4 footer-grid_section_w3layouts\">\r\n");
      out.write("                            <h3 class=\"footer-title text-uppercase text-wh mb-lg-4 mb-3\">Information</h3>\r\n");
      out.write("                            <ul class=\"list-unstyled w3layouts-icons\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"index.html\">Home</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"mt-3\">\r\n");
      out.write("                                    <a href=\"about.html\">About Us</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"mt-3\">\r\n");
      out.write("                                    <a href=\"#\">Gallery</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"mt-3\">\r\n");
      out.write("                                    <a href=\"#\">Services</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"mt-3\">\r\n");
      out.write("                                    <a href=\"contact.html\">Contact Us</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4 footer-grid_section_w3layouts\">\r\n");
      out.write("                            <!-- social icons -->\r\n");
      out.write("                            <div class=\"agileinfo_social_icons\">\r\n");
      out.write("                                <h3 class=\"footer-title text-uppercase text-wh mb-lg-4 mb-3\">Customer Service</h3>\r\n");
      out.write("                                <ul class=\"list-unstyled w3layouts-icons\">\r\n");
      out.write("\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\">About Us</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"mt-3\">\r\n");
      out.write("                                        <a href=\"#\">Delivery & Returns</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"mt-3\">\r\n");
      out.write("                                        <a href=\"#\">Waranty</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"mt-3\">\r\n");
      out.write("                                        <a href=\"#\">Terms & Condition</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"mt-3\">\r\n");
      out.write("                                        <a href=\"#\">Privacy Plolicy</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- social icons -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4 footer-grid_section_w3layouts my-md-0 my-5\">\r\n");
      out.write("                            <h3 class=\"footer-title text-uppercase text-wh mb-lg-4 mb-3\">Contact Info</h3>\r\n");
      out.write("                            <div class=\"contact-info\">\r\n");
      out.write("                                <div class=\"footer-address-inf\">\r\n");
      out.write("                                    <h4 class=\"ad-info mb-2\">Phone</h4>\r\n");
      out.write("                                    <p>+121 098 8907 9987</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"footer-address-inf my-4\">\r\n");
      out.write("                                    <h4 class=\"ad-info mb-2\">Email </h4>\r\n");
      out.write("                                    <p><a href=\"mailto:info@example.com\">info@example.com</a></p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"footer-address-inf\">\r\n");
      out.write("                                    <h4 class=\"ad-info mb-2\">Location</h4>\r\n");
      out.write("                                    <p>Honey Avenue, New York City</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"cpy-right text-left row\">\r\n");
      out.write("                        <p class=\"col-md-10\">� 2019 Bootie. All rights reserved | Design by\r\n");
      out.write("                            <a href=\"http://w3layouts.com\"> W3layouts.</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <!-- move top icon -->\r\n");
      out.write("                        <a href=\"#home\" class=\"move-top text-right col-md-2\"><span class=\"fa fa-long-arrow-up\" aria-hidden=\"true\"></span></a>\r\n");
      out.write("                        <!-- //move top icon -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- //footer -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
