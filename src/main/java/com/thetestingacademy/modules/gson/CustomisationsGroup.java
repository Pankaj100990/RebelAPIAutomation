package com.thetestingacademy.modules.gson;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomisationsGroup {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("customisations")
    @Expose
    private List<Customisation> customisations;
    @SerializedName("group_id")
    @Expose
    private Integer groupId;
    @SerializedName("type")
    @Expose
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customisation> getCustomisations() {
        return customisations;
    }

    public void setCustomisations(List<Customisation> customisations) {
        this.customisations = customisations;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}