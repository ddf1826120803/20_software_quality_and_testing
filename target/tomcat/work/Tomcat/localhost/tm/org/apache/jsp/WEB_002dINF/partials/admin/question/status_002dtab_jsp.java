/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-16 10:24:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.admin.question;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class status_002dtab_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <nav class=\"toolbar navbar navbar-default\">\r\n");
      out.write("        <div class=\"collapse navbar-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a id=\"create-status-btn\" class=\"btn btn-primary navbar-btn-tm\" href=\"#save-status-form\" data-toggle=\"collapse\" role=\"button\"><i class=\"glyphicon glyphicon-plus-sign\"></i>编辑题目状态</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <form class=\"navbar-form\" role=\"search\" onsubmit=\"return false;\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input id=\"status-keyword\" type=\"text\" class=\"form-control\" placeholder=\"状态\">\r\n");
      out.write("                            <a id=\"search-user-btn\" class=\"btn btn-danger navbar-btn-tm\"><i class=\"glyphicon glyphicon-search\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <form id=\"save-status-form\" class=\"collapse titled-border-form form-horizontal\" role=\"form\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("            <legend>&nbsp;</legend>\r\n");
      out.write("            <div id=\"status-id-row\" class=\"form-group hidden\">\r\n");
      out.write("                <label for=\"status-id\" class=\"col-md-2 col-lg-1 control-label\">ID</label>\r\n");
      out.write("                <div class=\"col-md-1\">\r\n");
      out.write("                    <input type=\"text\" id=\"status-id\" name=\"id\" minlength=\"2\" class=\"form-control\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"status-name\" class=\"col-md-2 col-lg-1 control-label\">状态</label>\r\n");
      out.write("                <div class=\"col-md-3 col-lg-2\">\r\n");
      out.write("                    <input type=\"text\" id=\"status-name\" name=\"name\" minlength=\"2\" class=\"form-control\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <label class=\"checkbox-inline\">\r\n");
      out.write("                    <input id=\"start-status\" name=\"special\" type=\"radio\"> 起始状态\r\n");
      out.write("                </label>\r\n");
      out.write("                <label class=\"checkbox-inline\">\r\n");
      out.write("                    <input id=\"finish-status\" name=\"special\" type=\"radio\"> 结束状态\r\n");
      out.write("                </label>\r\n");
      out.write("                <label class=\"checkbox-inline\">\r\n");
      out.write("                    <input id=\"na-status\" name=\"special\" type=\"radio\"> 取消\r\n");
      out.write("                </label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"col-md-2 col-lg-1 control-label\">权限分配</label>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <label class=\"checkbox-inline\">\r\n");
      out.write("                        <input type=\"checkbox\" id=\"status-acl-facilitator\" name=\"accessibleByFacilitator\"> 主持人\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label class=\"checkbox-inline\">\r\n");
      out.write("                        <input type=\"checkbox\" id=\"status-acl-author\" name=\"accessibleByAuthor\"> 作者\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label class=\"checkbox-inline\">\r\n");
      out.write("                        <input type=\"checkbox\" id=\"status-acl-reviewer\" name=\"accessibleByReviewer\"> 评审\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label class=\"checkbox-inline\">\r\n");
      out.write("                        <input type=\"checkbox\" id=\"status-acl-qa\" name=\"accessibleByQualityAdmin\" checked> 质管\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-md-offset-2 col-md-2 col-lg-offset-1 col-lg-1\">\r\n");
      out.write("                    <button id=\"save-status-btn\" type=\"submit\" class=\"btn btn-primary\">保存</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-2 col-lg-1\">\r\n");
      out.write("                    <button id=\"reset-status-btn\" type=\"reset\" class=\"btn btn-warning\">重置</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <table id=\"status-data-table\" class=\"table table-condensed table-bordered table-striped table-responsive table-hover\">\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script id=\"status-data-template\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th class=\"action-col-2\"></th>\r\n");
      out.write("        <th>ID</th>\r\n");
      out.write("        <th>状态</th>\r\n");
      out.write("        <th>初始状态</th>\r\n");
      out.write("        <th>结束状态</th>\r\n");
      out.write("        <th>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <label class=\"col-md-offset-4 col-md-4 label-lg label-info\">权限控制</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <span class=\"col-md-3\">主持人</span>\r\n");
      out.write("                <span class=\"col-md-3\">作者</span>\r\n");
      out.write("                <span class=\"col-md-3\">评审</span>\r\n");
      out.write("                <span class=\"col-md-3\">质管</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("    {{#each statuses}}\r\n");
      out.write("    <tr class=\"item-row\" data-index=\"{{@index}}\">\r\n");
      out.write("        <td>\r\n");
      out.write("            <a href=\"#\" class=\"edit-item\"><i class=\"glyphicon glyphicon-edit\"></i></a>\r\n");
      out.write("            <a href=\"#\" class=\"delete-item\"><i class=\"glyphicon glyphicon-remove\"></i></a>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>{{id}}</td>\r\n");
      out.write("        <td title=\"\r\n");
      out.write("        创建日期：{{date createdOn}}\r\n");
      out.write("更新日期：{{date updatedOn}}\">{{name}}</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            {{#if start}}\r\n");
      out.write("            <span class=\"label-lg label-success\">初始状态</span>\r\n");
      out.write("            {{/if}}\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("            {{#if finish}}\r\n");
      out.write("            <span class=\"label-lg label-danger\">结束状态</span>\r\n");
      out.write("            {{/if}}\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <span class=\"col-md-3\">\r\n");
      out.write("                {{#if accessibleByFacilitator}}\r\n");
      out.write("                    <i class=\"label-lg label-success glyphicon glyphicon-ok\"></i>\r\n");
      out.write("                {{else}}\r\n");
      out.write("                    <i class=\"label-lg label-default glyphicon glyphicon-remove\"></i>\r\n");
      out.write("                {{/if}}\r\n");
      out.write("            </span>\r\n");
      out.write("            <span class=\"col-md-3\">\r\n");
      out.write("                {{#if accessibleByAuthor}}\r\n");
      out.write("                    <i class=\"label-lg label-success glyphicon glyphicon-ok\"></i>\r\n");
      out.write("                {{else}}\r\n");
      out.write("                    <i class=\"label-lg label-default glyphicon glyphicon-remove\"></i>\r\n");
      out.write("                {{/if}}\r\n");
      out.write("            </span>\r\n");
      out.write("            <span class=\"col-md-3\">\r\n");
      out.write("                {{#if accessibleByReviewer}}\r\n");
      out.write("                    <i class=\"label-lg label-success glyphicon glyphicon-ok\"></i>\r\n");
      out.write("                {{else}}\r\n");
      out.write("                    <i class=\"label-lg label-default glyphicon glyphicon-remove\"></i>\r\n");
      out.write("                {{/if}}\r\n");
      out.write("            </span>\r\n");
      out.write("            <span class=\"col-md-3\">\r\n");
      out.write("                {{#if accessibleByQualityAdmin}}\r\n");
      out.write("                    <i class=\"label-lg label-success glyphicon glyphicon-ok\"></i>\r\n");
      out.write("                {{else}}\r\n");
      out.write("                    <i class=\"label-lg label-default glyphicon glyphicon-remove\"></i>\r\n");
      out.write("                {{/if}}\r\n");
      out.write("            </span>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    {{/each}}\r\n");
      out.write("    </tbody>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script id=\"delete-status-msg\" type=\"text/x-handlebars-template\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-offset-2 col-md-8\">\r\n");
      out.write("            <p class=\" alert alert-danger\" role=\"alert\">确定要删除以下状态吗？</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-offset-2 col-md-8\">\r\n");
      out.write("            <table class=\"table table-striped table-bordered\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>ID</b></td>\r\n");
      out.write("                    <td>{{id}}</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>名称</b></td>\r\n");
      out.write("                    <td>{{name}}</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>初始状态</b></td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        {{#if start}}\r\n");
      out.write("                        <span class=\"label-lg label-danger\">初始状态</span>\r\n");
      out.write("                        {{/if}}\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>结束状态</b></td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        {{#if finish}}\r\n");
      out.write("                        <span class=\"label-lg label-danger\">结束状态</span>\r\n");
      out.write("                        {{/if}}\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/admin/question/question-status.js\"></script>\r\n");
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