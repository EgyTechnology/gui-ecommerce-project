package edu.ndeti.advanced.project.pcoders.models;

public abstract class UniqueItem {
    private String identifier = null;

    public void setIdentifier(String identifier) {
        if (this.identifier == null)
            this.identifier = identifier;
    }

    public String getIdentifier() {
        if (identifier == null)
            return "";

        return identifier;
    }
}
