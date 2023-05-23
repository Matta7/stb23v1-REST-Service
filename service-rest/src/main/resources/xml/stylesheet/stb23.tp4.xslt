<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="3.0" xmlns:stb="http://univrouen.fr/stb23">

    <xsl:output method="html" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head></head>
            <body>
                <h1>STB23 - XSLT V1.0</h1>
                <p>Vallée Mathieu (<xsl:value-of select="format-date(current-date(), 'Le [D01] [MNn] [Y0001]')"/>)</p>

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
                <ol>
                    <xsl:for-each select="stb:stb/features/feature">
                        <li><xsl:value-of select="@number" />-<xsl:value-of select="@section" /> : <xsl:value-of select="comment" /></li>
                    </xsl:for-each>
                </ol>
                <xsl:for-each select="stb:stb/features/feature">
                    <p>
                        Item <xsl:value-of select="@number" />.<xsl:value-of select="@section" /> : <xsl:value-of select="comment" /><br/>
                        Priorité : <xsl:value-of select="priority" /> Livraison : <xsl:value-of select="delivery" /><br/>
                        <xsl:value-of select="description" /><br/>
                    </p>
                </xsl:for-each>

                <h2>Statistiques</h2>

                <p>Nb fonctionnalités = <xsl:value-of select="count(stb:stb/features/feature)" /></p>
                <p>
                    <xsl:for-each-group select="stb:stb/features/feature" group-by="priority">
                        <xsl:value-of select="position()"/>
                        <xsl:text> - priorité = </xsl:text>
                        <xsl:value-of select="current-grouping-key()"/>
                        <xsl:text> : </xsl:text>
                        <xsl:value-of select="count(current-group())"></xsl:value-of>
                        <xsl:text> fonctionnalités </xsl:text>
                        <br/>
                    </xsl:for-each-group>
                </p>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>