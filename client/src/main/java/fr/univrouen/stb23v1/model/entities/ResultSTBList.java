package fr.univrouen.stb23v1.model.entities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultSTBList {

    @XmlElement(name = "stb")
    private List<STBResume> stbList;

    public ResultSTBList() {
        stbList = new ArrayList<>();
    }


    public List<STBResume> getStbList() {
        return stbList;
    }

    public void setStbList(List<STBResume> stbList) {
        this.stbList = stbList;
    }

    public void addStb(STBResume stb) {
        stbList.add(stb);
    }

    @Override
    public String toString() {
        String res = "";
        for(STBResume stbResume : stbList) {
            res += stbResume;
        }
        return res;
    }
}
