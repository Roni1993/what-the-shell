package org.roni.man.model;

import java.util.List;

public class Usage {
    String summary;
    List<String> parameter;
    List<Options> options;
    List<Options> valueOptions;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getParameter() {
        return parameter;
    }

    public void setParameter(List<String> parameter) {
        this.parameter = parameter;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }

    public List<Options> getValueOptions() {
        return valueOptions;
    }

    public void setValueOptions(List<Options> valueOptions) {
        this.valueOptions = valueOptions;
    }
}
