package com.example.polska.apisearchboard.enumeration;

public enum ContractEnum {
    FullTime("Full Time"),
    PartTime("Part Time"),
    Contract("Contract");

    private String title;

    ContractEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "ContractEnum{" +
                "title='" + title + '\'' +
                '}';
    }
}
