<%@ page import="MyProjects.*"%>
<%@ page import="java.util.Properties" %>
<%@ page import="java.io.InputStream" %>

Hello
<%
Properties props = new Properties();
InputStream is = getServletContext().getResourceAsStream("/WEB-INF/classes/ri.properties");
props.load(is);
is.close();
out.print(""+props.get("foo"));

// test log
App app = new App();
app.TestLog();

%>