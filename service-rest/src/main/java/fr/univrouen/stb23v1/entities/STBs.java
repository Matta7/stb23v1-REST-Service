package fr.univrouen.stb23v1.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "stbs")
@XmlAccessorType(XmlAccessType.FIELD)
public class STBs {

    @XmlElement(name = "stb")
    private List<STB> stbList;

    public STBs() {
        stbList = new ArrayList<>();
    }

    public List<STB> getStbList() {
        return stbList;
    }

    public void setStbList(List<STB> stbList) {
        this.stbList = stbList;
    }

    public void addSTB(STB stb) {
        stbList.add(stb);
    }
}
