package com.github.common.enums;

public enum RepaymentModeEnum {

    DAILY_INTEREST_LSBQ("daily_interest_lsbq","按日计息，利随本清"),
    MONTH_INTEREST_LSBQ("month_interest_lsbq","按月计息，利随本清"),
    DAILY_INTEREST_XXHB("daily_interest_xxhb","按日计息，先息后本"),
    MONTH_INTEREST_XXHB("month_interest_xxhb","按月计息，先息后本"),
    MONTH_INTEREST_DEBX("month_interest_debx","按月计息，等额本息"),
    MONTH_INTEREST_DEBJ("month_interest_debj","按月计息，等额本金"),
    DAILY_INTEREST_SJSH("daily_interest_sjsh","按日计息，随借随还");

    private String code;
    private String value;

    RepaymentModeEnum(String code, String value){
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

}
