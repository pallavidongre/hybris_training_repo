/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2020-06-17 08:00:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web.responsive.formElement;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formCheckbox_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
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
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("jar:file:/D:/HybrisProject/hybris/bin/custom/nendrasys/nendrasysstorefront/web/webroot/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1308107170000L));
    _jspx_dependants.put("jar:file:/D:/HybrisProject/hybris/bin/custom/nendrasys/nendrasysstorefront/web/webroot/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/c.tld", Long.valueOf(1308107170000L));
    _jspx_dependants.put("jar:file:/D:/HybrisProject/hybris/bin/platform/ext/core/lib/spring-webmvc-5.1.6.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1554000908000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/template/errorSpanField.tag", Long.valueOf(1575284945296L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/template/implicit.tld", Long.valueOf(1575284945296L));
    _jspx_dependants.put("file:/D:/HybrisProject/hybris/bin/platform/ext/core/lib/spring-webmvc-5.1.6.RELEASE.jar", Long.valueOf(1568020161000L));
    _jspx_dependants.put("jar:file:/D:/HybrisProject/hybris/bin/platform/ext/core/lib/spring-webmvc-5.1.6.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1554000908000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl-1.2.jar", Long.valueOf(1592380634157L));
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

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fhtmlEscape_0026_005fdefaultHtmlEscape_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005ftabindex_005fpath_005fid_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String idKey;
  private java.lang.String labelKey;
  private java.lang.String path;
  private java.lang.Boolean mandatory;
  private java.lang.String labelCSS;
  private java.lang.String inputCSS;
  private java.lang.String tabindex;

  public java.lang.String getIdKey() {
    return this.idKey;
  }

  public void setIdKey(java.lang.String idKey) {
    this.idKey = idKey;
    jspContext.setAttribute("idKey", idKey);
  }

  public java.lang.String getLabelKey() {
    return this.labelKey;
  }

  public void setLabelKey(java.lang.String labelKey) {
    this.labelKey = labelKey;
    jspContext.setAttribute("labelKey", labelKey);
  }

  public java.lang.String getPath() {
    return this.path;
  }

  public void setPath(java.lang.String path) {
    this.path = path;
    jspContext.setAttribute("path", path);
  }

  public java.lang.Boolean getMandatory() {
    return this.mandatory;
  }

  public void setMandatory(java.lang.Boolean mandatory) {
    this.mandatory = mandatory;
    jspContext.setAttribute("mandatory", mandatory);
  }

  public java.lang.String getLabelCSS() {
    return this.labelCSS;
  }

  public void setLabelCSS(java.lang.String labelCSS) {
    this.labelCSS = labelCSS;
    jspContext.setAttribute("labelCSS", labelCSS);
  }

  public java.lang.String getInputCSS() {
    return this.inputCSS;
  }

  public void setInputCSS(java.lang.String inputCSS) {
    this.inputCSS = inputCSS;
    jspContext.setAttribute("inputCSS", inputCSS);
  }

  public java.lang.String getTabindex() {
    return this.tabindex;
  }

  public void setTabindex(java.lang.String tabindex) {
    this.tabindex = tabindex;
    jspContext.setAttribute("tabindex", tabindex);
  }

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
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fspring_005fhtmlEscape_0026_005fdefaultHtmlEscape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005ftabindex_005fpath_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fhtmlEscape_0026_005fdefaultHtmlEscape_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005ftabindex_005fpath_005fid_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getIdKey() != null ) 
      _jspx_page_context.setAttribute("idKey", getIdKey());
    if( getLabelKey() != null ) 
      _jspx_page_context.setAttribute("labelKey", getLabelKey());
    if( getPath() != null ) 
      _jspx_page_context.setAttribute("path", getPath());
    if( getMandatory() != null ) 
      _jspx_page_context.setAttribute("mandatory", getMandatory());
    if( getLabelCSS() != null ) 
      _jspx_page_context.setAttribute("labelCSS", getLabelCSS());
    if( getInputCSS() != null ) 
      _jspx_page_context.setAttribute("inputCSS", getInputCSS());
    if( getTabindex() != null ) 
      _jspx_page_context.setAttribute("tabindex", getTabindex());

    try {
      if (_jspx_meth_spring_005fhtmlEscape_005f0(_jspx_page_context))
        return;
      //  template:errorSpanField
      org.apache.jsp.tag.web.responsive.template.errorSpanField_tag _jspx_th_template_005ferrorSpanField_005f0 = new org.apache.jsp.tag.web.responsive.template.errorSpanField_tag();
      _jsp_getInstanceManager().newInstance(_jspx_th_template_005ferrorSpanField_005f0);
      try {
        _jspx_th_template_005ferrorSpanField_005f0.setJspContext(_jspx_page_context);
        _jspx_th_template_005ferrorSpanField_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));        // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(18,0) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
        _jspx_th_template_005ferrorSpanField_005f0.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
        _jspx_th_template_005ferrorSpanField_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_template_005ferrorSpanField_005f0, null));
        _jspx_th_template_005ferrorSpanField_005f0.doTag();
      } finally {
        _jsp_getInstanceManager().destroyInstance(_jspx_th_template_005ferrorSpanField_005f0);
      }
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_spring_005fhtmlEscape_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:htmlEscape
    org.springframework.web.servlet.tags.HtmlEscapeTag _jspx_th_spring_005fhtmlEscape_005f0 = (org.springframework.web.servlet.tags.HtmlEscapeTag) _005fjspx_005ftagPool_005fspring_005fhtmlEscape_0026_005fdefaultHtmlEscape_005fnobody.get(org.springframework.web.servlet.tags.HtmlEscapeTag.class);
    boolean _jspx_th_spring_005fhtmlEscape_005f0_reused = false;
    try {
      _jspx_th_spring_005fhtmlEscape_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fhtmlEscape_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(16,0) name = defaultHtmlEscape type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fhtmlEscape_005f0.setDefaultHtmlEscape(true);
      int[] _jspx_push_body_count_spring_005fhtmlEscape_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fhtmlEscape_005f0 = _jspx_th_spring_005fhtmlEscape_005f0.doStartTag();
        if (_jspx_th_spring_005fhtmlEscape_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fhtmlEscape_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fhtmlEscape_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fhtmlEscape_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005fhtmlEscape_0026_005fdefaultHtmlEscape_005fnobody.reuse(_jspx_th_spring_005fhtmlEscape_005f0);
      _jspx_th_spring_005fhtmlEscape_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fhtmlEscape_005f0, _jsp_getInstanceManager(), _jspx_th_spring_005fhtmlEscape_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f0 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    boolean _jspx_th_spring_005ftheme_005f0_reused = false;
    try {
      _jspx_th_spring_005ftheme_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005ftheme_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(19,1) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005ftheme_005f0.setCode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${idKey}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(19,1) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005ftheme_005f0.setVar("themeIdKey");
      int[] _jspx_push_body_count_spring_005ftheme_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005ftheme_005f0 = _jspx_th_spring_005ftheme_005f0.doStartTag();
        if (_jspx_th_spring_005ftheme_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005ftheme_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005ftheme_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005ftheme_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f0);
      _jspx_th_spring_005ftheme_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005ftheme_005f0, _jsp_getInstanceManager(), _jspx_th_spring_005ftheme_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_005fcheckbox_005f0 = (org.springframework.web.servlet.tags.form.CheckboxTag) _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005ftabindex_005fpath_005fid_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    boolean _jspx_th_form_005fcheckbox_005f0_reused = false;
    try {
      _jspx_th_form_005fcheckbox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fcheckbox_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(24,7) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fcheckbox_005f0.setCssClass((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inputCSS}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(24,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fcheckbox_005f0.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${themeIdKey}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(24,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fcheckbox_005f0.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(24,7) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fcheckbox_005f0.setTabindex((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tabindex}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      int[] _jspx_push_body_count_form_005fcheckbox_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fcheckbox_005f0 = _jspx_th_form_005fcheckbox_005f0.doStartTag();
        if (_jspx_th_form_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fcheckbox_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fcheckbox_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fcheckbox_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005ftabindex_005fpath_005fid_005fcssClass_005fnobody.reuse(_jspx_th_form_005fcheckbox_005f0);
      _jspx_th_form_005fcheckbox_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fcheckbox_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fcheckbox_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f1 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    boolean _jspx_th_spring_005ftheme_005f1_reused = false;
    try {
      _jspx_th_spring_005ftheme_005f1.setPageContext(_jspx_page_context);
      _jspx_th_spring_005ftheme_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(25,7) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005ftheme_005f1.setCode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${labelKey}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      int[] _jspx_push_body_count_spring_005ftheme_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005ftheme_005f1 = _jspx_th_spring_005ftheme_005f1.doStartTag();
        if (_jspx_th_spring_005ftheme_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005ftheme_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005ftheme_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005ftheme_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f1);
      _jspx_th_spring_005ftheme_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005ftheme_005f1, _jsp_getInstanceManager(), _jspx_th_spring_005ftheme_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(26,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mandatory != null && mandatory == true}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<span class=\"mandatory\">\n");
          out.write("\t   \t\t\t\t\t");
          if (_jspx_meth_spring_005ftheme_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("</span>\n");
          out.write("\t   \t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f2 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    boolean _jspx_th_spring_005ftheme_005f2_reused = false;
    try {
      _jspx_th_spring_005ftheme_005f2.setPageContext(_jspx_page_context);
      _jspx_th_spring_005ftheme_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(28,9) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005ftheme_005f2.setCode("login.required");
      // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(28,9) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005ftheme_005f2.setVar("loginrequiredText");
      int[] _jspx_push_body_count_spring_005ftheme_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005ftheme_005f2 = _jspx_th_spring_005ftheme_005f2.doStartTag();
        if (_jspx_th_spring_005ftheme_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005ftheme_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005ftheme_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005ftheme_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fvar_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f2);
      _jspx_th_spring_005ftheme_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005ftheme_005f2, _jsp_getInstanceManager(), _jspx_th_spring_005ftheme_005f2_reused);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      if (_jspx_meth_spring_005ftheme_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("<div class=\"checkbox\">\n");
      out.write("\t   \t\t\n");
      out.write("\t   \t\t<label class=\"control-label ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(labelCSS)}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_0));
      out.write("\" for=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(themeIdKey)}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_0));
      out.write("\">\n");
      out.write("\t   \t\t\t");
      if (_jspx_meth_form_005fcheckbox_005f0(_jspx_parent, _jspx_page_context))
        return;
      if (_jspx_meth_spring_005ftheme_005f1(_jspx_parent, _jspx_page_context))
        return;
      if (_jspx_meth_c_005fif_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("<span class=\"skip\">");
      //  form:errors
      org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
      boolean _jspx_th_form_005ferrors_005f0_reused = false;
      try {
        _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
        _jspx_th_form_005ferrors_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
        // /WEB-INF/tags/responsive/formElement/formCheckbox.tag(31,26) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_form_005ferrors_005f0.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
        int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
          if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            throw new javax.servlet.jsp.SkipPageException();
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_form_005ferrors_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
        _jspx_th_form_005ferrors_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005ferrors_005f0, _jsp_getInstanceManager(), _jspx_th_form_005ferrors_005f0_reused);
      }
      out.write("</span>\n");
      out.write("\t   \t\t</label>\n");
      out.write("\t   \t</div>\n");
      out.write("\n");
      return;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}