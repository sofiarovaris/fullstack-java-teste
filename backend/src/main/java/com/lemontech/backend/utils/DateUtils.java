package com.lemontech.backend.utils;

import java.time.LocalDateTime;
import java.util.GregorianCalendar;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Utility class for date-related operations.
 */
public class DateUtils {

    /**
     * Converts an XMLGregorianCalendar to a LocalDateTime.
     * 
     * @param xmlGregorianCalendar the XMLGregorianCalendar to be converted.
     * @return the corresponding LocalDateTime, or null if the input is null.
     */
    public static LocalDateTime convertXMLGregorianCalendarToLocalDateTime(XMLGregorianCalendar xmlGregorianCalendar) {
        if (xmlGregorianCalendar != null) {
            GregorianCalendar gregorianCalendar = xmlGregorianCalendar.toGregorianCalendar();
            return gregorianCalendar.toZonedDateTime().toLocalDateTime();
        }
        return null;
    }
}
