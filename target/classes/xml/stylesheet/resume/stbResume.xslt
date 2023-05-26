<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Résultats STB</title>
            </head>
            <body>
                <table border="1">
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Description</th>
                        <th>Date</th>
                        <th>Client Entity</th>
                    </tr>
                    <xsl:apply-templates select="result/stb"/>
                </table>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="stb">
        <tr>
            <td><xsl:value-of select="@id"/></td>
            <td><xsl:value-of select="title"/></td>
            <td><xsl:value-of select="description"/></td>
            <td><xsl:value-of select="date"/></td>
            <td><xsl:value-of select="client-entity"/></td>
        </tr>
    </xsl:template>
</xsl:stylesheet>