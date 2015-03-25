<%@ taglib prefix="props" tagdir="/WEB-INF/tags/props" %>
<%@ taglib prefix="forms" tagdir="/WEB-INF/tags/forms" %>
<%@ taglib prefix="l" tagdir="/WEB-INF/tags/layout" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="propertiesBean" scope="request" type="jetbrains.buildServer.controllers.BasePropertiesBean"/>

<l:settingsGroup title="Octopus Nuget Package properties">
    <tr>
        <th>
            <label for="octocity.id">Package id: <l:star/></label>
        </th>
        <td>
            <props:textProperty name="octocity.id" className="longField" />
            <span class="error" id="error_octocity.id"></span>
            <span class="smallNote">Package identifier (eg. package.id)</span>
        </td>
    </tr>
    <tr>
        <th>
            <label for="octocity.title">Title: </label>
        </th>
        <td>
            <props:textProperty name="octocity.title" className="longField" />
            <span class="error" id="error_octocity.title"></span>
            <span class="smallNote">Package title (eg. 'This is an awesome package')</span>
        </td>
    </tr>
    <tr>
        <th>
            <label for="octocity.version">Version: <l:star/></label>
        </th>
        <td>
            <props:textProperty name="octocity.version" className="longField" />
            <span class="error" id="error_octocity.version"></span>
            <span class="smallNote">Package version (eg. 1.2.3)</span>
        </td>
    </tr>
    <tr>
        <th>
            <label for="octocity.owners">Onwers: <l:star/></label>
        </th>
        <td>
            <props:textProperty name="octocity.owners" className="longField" />
            <span class="error" id="error_octocity.owners"></span>
            <span class="smallNote">Package owners (eg. 'superman, batman')</span>
        </td>
    </tr>
    <tr>
        <th>
            <label for="octocity.description">Description: <l:star/></label>
        </th>
        <td>
            <props:textProperty name="octocity.description" className="longField" />
            <span class="error" id="error_octocity.description"></span>
            <span class="smallNote">Package description (eg. 'This is a nice deployment package')</span>
        </td>
    </tr>
</l:settingsGroup>