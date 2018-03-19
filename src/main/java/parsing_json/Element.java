package parsing_json;

import java.util.ArrayList;

public class Element {

    private String name;
    private String appearance;
    private Double atomic_Mass;
    private Double boil;
    private String category;
    private String color;
    private Double density;
    private String discovered_by;
    private Double melt;
    private Double molar_heat;
    private String named_by;
    private long number;
    private long period;
    private String phase;
    private String source;
    private String spectralImage;
    private String summary;
    private String symbol;
    private long xpos;
    private long ypos;
    private ArrayList<Integer> shells;

    public Element(String name, String appearance, Double atomicMass, Double boil, String category, String color, Double density, String discoveredBy, Double melt, Double molarHeat, String namedBy, Integer number, Integer period, String phase, String source, String spectralImage, String summary, String symbol, Integer xpos, Integer ypos, ArrayList<Integer> shells) {
        this.name = name;
        this.appearance = appearance;
        this.atomic_Mass = atomicMass;
        this.boil = boil;
        this.category = category;
        this.color = color;
        this.density = density;
        this.discovered_by = discoveredBy;
        this.melt = melt;
        this.molar_heat = molarHeat;
        this.named_by = namedBy;
        this.number = number;
        this.period = period;
        this.phase = phase;
        this.source = source;
        this.spectralImage = spectralImage;
        this.summary = summary;
        this.symbol = symbol;
        this.xpos = xpos;
        this.ypos = ypos;
        this.shells = shells;
    }

    public String getName() {
        return name;
    }

    public String getAppearance() {
        return appearance;
    }

    public Double getAtomic_mass() {
        return atomic_Mass;
    }

    public Double getBoil() {
        return boil;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public Double getDensity() {
        return density;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }

    public Double getMelt() {
        return melt;
    }

    public Double getMolar_heat() {
        return molar_heat;
    }

    public String getNamed_by() {
        return named_by;
    }

    public long getNumber() {
        return number;
    }

    public long getPeriod() {
        return period;
    }

    public String getPhase() {
        return phase;
    }

    public String getSource() {
        return source;
    }

    public String getSpectral_img() {
        return spectralImage;
    }

    public String getSummary() {
        return summary;
    }

    public String getSymbol() {
        return symbol;
    }

    public long getXpos() {
        return xpos;
    }

    public long getYpos() {
        return ypos;
    }

    public ArrayList<Integer> getShells() {
        return shells;
    }
}