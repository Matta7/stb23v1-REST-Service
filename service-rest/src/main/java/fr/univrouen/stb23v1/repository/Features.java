package fr.univrouen.stb23v1.repository;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "features")
@XmlAccessorType(XmlAccessType.FIELD)
public class Features {
    @XmlElement(name = "feature")
    private ArrayList<Feature> features;

    // Getters and setters
    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    // Constructors
    public Features() {
        this.features = new ArrayList<Feature>();
    }

    public Features(ArrayList<Feature> features) {
        this.features = features;
    }

    // Methods
    public void addFeature(Feature feature) {
        this.features.add(feature);
    }

    public void removeFeature(Feature feature) {
        this.features.remove(feature);
    }

    public Feature getFeature(int index) {
        return this.features.get(index);
    }

    public int size() {
        return this.features.size();
    }

    public boolean isEmpty() {
        return this.features.isEmpty();
    }

    public boolean contains(Feature feature) {
        return this.features.contains(feature);
    }

    public void clear() {
        this.features.clear();
    }

    // Methods
    public String toString() {
        String str = "Features{\n";
        for (Feature feature : this.features) {
            str += feature.toString() + "\n";
        }
        str += "}";
        return str;
    }


}
