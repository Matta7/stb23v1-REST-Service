<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:stb="http://univrouen.fr/stb23">

    <xsl:output method="html" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head></head>
            <body>
                <h1>STB23 - XSLT V1.0</h1>
                <p>Vallée Mathieu (le 1 mars 2023)</p>

                <h2><xsl:value-of select="stb:stb/title"/></h2>
                <p>( <xsl:value-of select="stb:stb/version"/> - <xsl:value-of select="stb:stb/date"/> )</p>
                <p><xsl:value-of select="stb:stb/description"/></p>

                <h2>Client : <xsl:value-of select="stb:stb/client/entity"/></h2>
                <p>Contact : <xsl:value-of select="stb:stb/client/person"/> - tel : <xsl:value-of select="stb:stb/client/tel"/></p>

                <h2>Équipe</h2>
                <ul>
                    <xsl:for-each select="stb:stb/team/member">
                        <li>
                            <p>
                                <xsl:value-of select="person/@gender" />‎ <xsl:value-of select="person" /> : <xsl:value-of select="function"/> ( <xsl:value-of select="mail" /> )
                            </p>
                        </li>
                    </xsl:for-each>
                </ul>

                <h2>Liste de fonctionnalités</h2>
                <xsl:for-each select="stb:stb/features/feature">
                    <p>item = <xsl:value-of select="@number" />.<xsl:value-of select="@section" /></p>
                    <p>Priorité : <xsl:value-of select="priority" /> Livraison : <xsl:value-of select="delivery" /></p>
                    <p><xsl:value-of select="description" /><br/><xsl:value-of select="comment" /></p>
                </xsl:for-each>

            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>