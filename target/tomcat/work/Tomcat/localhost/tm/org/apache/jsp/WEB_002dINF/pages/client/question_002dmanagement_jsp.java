/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-16 10:04:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class question_002dmanagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<div class=\"page-header\">\r\n");
      out.write("    <h1>题目管理\r\n");
      out.write("        <small>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PROJECT.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</small>\r\n");
      out.write("    </h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <nav class=\"toolbar navbar navbar-default\">\r\n");
      out.write("            <div class=\"collapse navbar-collapse\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a id=\"show-edit-question-form-btn\" class=\"btn btn-primary navbar-btn-tm\" data-toggle=\"modal\"\r\n");
      out.write("                           role=\"button\"><i class=\"glyphicon glyphicon-plus-sign\"></i>新增题目</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a id=\"reload-question-btn\" href=\"#\" class=\"btn btn-primary navbar-btn-tm\" role=\"button\"><i\r\n");
      out.write("                                class=\"glyphicon glyphicon-refresh\"></i>刷新</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a id=\"batch-update-initial-status-btn\" href=\"#\" class=\"btn btn-primary navbar-btn-tm disabled\"\r\n");
      out.write("                           role=\"button\"><i class=\"glyphicon glyphicon-pencil\"></i>批量修改状态</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <form class=\"navbar-form\" role=\"search\" onsubmit=\"return false;\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input id=\"question-keyword\" type=\"text\" class=\"form-control\" placeholder=\"题目关键字\">\r\n");
      out.write("                                <a id=\"search-syllabus-btn\" class=\"btn btn-danger navbar-btn-tm\"><i\r\n");
      out.write("                                        class=\"glyphicon glyphicon-search\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/partials/client/question-management/new-question-form.jsp", out, false);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/partials/pagination-snippet.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"msg-area form-group\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <table id=\"question-mgmt-table\" class=\"table table-striped table-bordered table-responsive table-condensed\">\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"batch-update-status-modal\" class=\"modal fade\" data-backdrop=\"static\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header modal-header-warning\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span\r\n");
      out.write("                            aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                    <span class=\"modal-title\">批量修改状态</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <h4>请慎重选择要将初始状态的问题转换到的状态。如不做修改，请直接关闭对话框。</h4>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"init-transition-actions-container\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script id=\"initial-status-transition\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    <ul class=\"list-inline\">\r\n");
      out.write("        {{#each transitions}}\r\n");
      out.write("        <li>\r\n");
      out.write("            <button class=\"transition-initial btn btn-primary\" data-id=\"{{id}}\">{{name}}</button>\r\n");
      out.write("        </li>\r\n");
      out.write("        {{/each}}\r\n");
      out.write("    </ul>\r\n");
      out.write("</script>\r\n");
      out.write("<script id=\"delete-msg-template\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-offset-2 col-md-8\">\r\n");
      out.write("            <p class=\" alert alert-danger\" role=\"alert\">\r\n");
      out.write("                确定要删除以下题目吗？\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-offset-1 col-md-10\">\r\n");
      out.write("            <table class=\"table table-striped table-bordered\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>ID</b></td>\r\n");
      out.write("                    <td>{{id}}</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>题干</b></td>\r\n");
      out.write("                    <td>{{stem}}</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>知识点</b></td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        {{#each knowledgePoints}}\r\n");
      out.write("                        <span>{{number}}&nbsp;{{title}}</span>\r\n");
      out.write("                        {{/each}}\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>状态</b></td>\r\n");
      out.write("                    <td>{{status.name}}</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>作者</b></td>\r\n");
      out.write("                    <td>{{author.username}}</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>质管</b></td>\r\n");
      out.write("                    <td>{{qualityAdmin.username}}</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/client/question-management/manage-questions.js\"></script>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
