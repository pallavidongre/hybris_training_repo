/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2020-06-17 07:41:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.responsive.pages.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productReviewsTab_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(14);
    _jspx_dependants.put("/WEB-INF/tags/responsive/product/productPageReviewsTab.tag", Long.valueOf(1575284945048L));
    _jspx_dependants.put("jar:file:/D:/HybrisProject/hybris/bin/platform/ext/core/lib/spring-webmvc-5.1.6.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1554000908000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/template/errorSpanField.tag", Long.valueOf(1575284945296L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/template/implicit.tld", Long.valueOf(1575284945296L));
    _jspx_dependants.put("jar:file:/D:/HybrisProject/hybris/bin/platform/ext/core/lib/spring-webmvc-5.1.6.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1554000908000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl-1.2.jar", Long.valueOf(1592379543920L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/formElement/formTextArea.tag", Long.valueOf(1575284944547L));
    _jspx_dependants.put("jar:file:/D:/HybrisProject/hybris/bin/custom/nendrasys/nendrasysstorefront/web/webroot/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1308107170000L));
    _jspx_dependants.put("jar:file:/D:/HybrisProject/hybris/bin/custom/nendrasys/nendrasysstorefront/web/webroot/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/c.tld", Long.valueOf(1308107170000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/formElement/implicit.tld", Long.valueOf(1575284944547L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/formElement/formInputBox.tag", Long.valueOf(1575284944516L));
    _jspx_dependants.put("file:/D:/HybrisProject/hybris/bin/platform/ext/core/lib/spring-webmvc-5.1.6.RELEASE.jar", Long.valueOf(1568020161000L));
    _jspx_dependants.put("/WEB-INF/common/tld/ycommercetags.tld", Long.valueOf(1575284943861L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/product/implicit.tld", Long.valueOf(1575284944917L));
  }

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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div id=\"tabreview\" class=\"tabhead\">\r\n");
      out.write("\t<a href=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(title)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("</a> <span class=\"glyphicon\"></span>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"tabbody\">\r\n");
      out.write("\t<div class=\"container-lg\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("\t\t\t\t<div class=\"tab-container\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_product_005fproductPageReviewsTab_005f0(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_product_005fproductPageReviewsTab_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  product:productPageReviewsTab
    org.apache.jsp.tag.web.responsive.product.productPageReviewsTab_tag _jspx_th_product_005fproductPageReviewsTab_005f0 = new org.apache.jsp.tag.web.responsive.product.productPageReviewsTab_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_product_005fproductPageReviewsTab_005f0);
    try {
      _jspx_th_product_005fproductPageReviewsTab_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/views/responsive/pages/product/productReviewsTab.jsp(13,5) name = product type = de.hybris.platform.commercefacades.product.data.ProductData reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_product_005fproductPageReviewsTab_005f0.setProduct((de.hybris.platform.commercefacades.product.data.ProductData) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product}", de.hybris.platform.commercefacades.product.data.ProductData.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      _jspx_th_product_005fproductPageReviewsTab_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_product_005fproductPageReviewsTab_005f0);
    }
    return false;
  }
}