/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import util.enumeration.GroupLevelEnum;
import util.enumeration.SystemBoundaryEnum;

/**
 *
 * @author nickg
 */
@Entity
public class FunctionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long functionEntityId;

    @NotNull
    @Size(min = 1)
    private String functionName;

    @NotNull
    private String routerLink;

    @NotNull
    private String icon;

    @NotNull
    private String description;

    @NotNull
    private boolean inMenu;

    @NotNull
    @Enumerated(EnumType.STRING)
    private GroupLevelEnum groupLevelType;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SystemBoundaryEnum boundary;

    @ManyToMany
    private List<FunctionEntity> parent;

    @ManyToMany(mappedBy = "parent")
    private List<FunctionEntity> children;

    public FunctionEntity() {
        this.parent = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public FunctionEntity(String functionName, String routerLink, String icon, String description, boolean inMenu, SystemBoundaryEnum boundary) {
        this();
        this.functionName = functionName;
        this.routerLink = routerLink;
        this.icon = icon;
        this.description = description;
        this.inMenu = inMenu;
        this.boundary = boundary;
    }

    public FunctionEntity(String functionName, String routerLink, String icon, String description, boolean inMenu, List<FunctionEntity> parent, List<FunctionEntity> children, SystemBoundaryEnum boundary, GroupLevelEnum groupLevelType) {
        this();
        this.functionName = functionName;
        this.routerLink = routerLink;
        this.icon = icon;
        this.description = description;
        this.inMenu = inMenu;
        this.boundary = boundary;
        this.parent = parent;
        this.children = children;
        this.groupLevelType =groupLevelType;
        this.boundary = boundary;
    }

    public Long getFunctionEntityId() {
        return functionEntityId;
    }

    public void setFunctionEntityId(Long functionEntityId) {
        this.functionEntityId = functionEntityId;
    }

    public String getRouterLink() {
        return routerLink;
    }

    public void setRouterLink(String routerLink) {
        this.routerLink = routerLink;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isInMenu() {
        return inMenu;
    }

    public void setInMenu(boolean inMenu) {
        this.inMenu = inMenu;
    }

    public GroupLevelEnum getGroupLevelType() {
        return groupLevelType;
    }

    public void setGroupLevelType(GroupLevelEnum groupLevelType) {
        this.groupLevelType = groupLevelType;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SystemBoundaryEnum getBoundary() {
        return boundary;
    }

    public void setBoundary(SystemBoundaryEnum boundary) {
        this.boundary = boundary;
    }

    public List<FunctionEntity> getParent() {
        return parent;
    }

    public void setParent(List<FunctionEntity> parent) {
        this.parent = parent;
    }

    public List<FunctionEntity> getChildren() {
        return children;
    }

    public void setChildren(List<FunctionEntity> children) {
        this.children = children;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FunctionEntity other = (FunctionEntity) obj;
        if (!Objects.equals(this.functionEntityId, other.functionEntityId)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "";
    }

}
