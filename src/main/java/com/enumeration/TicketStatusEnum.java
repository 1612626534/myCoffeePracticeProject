package com.enumeration;

import org.springframework.util.StringUtils;

public enum TicketStatusEnum {

    TO_DO(10, "TO DO"), IN_PROGRESS(20, "IN PROGRESS"), PENDING(30, "PENDING"), FINISH(40, "FINISH");

    private int code;
    private String value;

    private TicketStatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static TicketStatusEnum getTicketStatusEnumByCode(int ticketStatusCode) {
        for (TicketStatusEnum ticketStatusEnum : TicketStatusEnum.values()) {
            if (ticketStatusEnum.getCode() == ticketStatusCode) {
                return ticketStatusEnum;
            }
        }
        return null;
    }

    public static TicketStatusEnum getTicketStatusEnumByName(String ticketStatusName) {
        if (StringUtils.isEmpty(ticketStatusName)) {
            return null;
        }

        for (TicketStatusEnum ticketStatusEnum : TicketStatusEnum.values()) {
            if (ticketStatusEnum.getValue().equals(ticketStatusName)) {
                return ticketStatusEnum;
            }
        }
        return null;
    }
}
