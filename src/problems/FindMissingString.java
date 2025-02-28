package problems;

import java.util.*;

public class FindMissingString {



    public static void findMissingKey(List<String> keyList, Map<String, String> jsonMap){
        Map<String, String> outputMap = new HashMap<>();

        for(String key : keyList){
            if(!jsonMap.containsKey(key)){
                outputMap.put(key, key);
            }
        }

        System.out.println(outputMap);

    }

    public static Map<String, String> addValueInMap(String jsonString){

        // Remove braces and split key-value pairs
        jsonString = jsonString.replaceAll("[{}\"]", "").trim();
        String[] pairs = jsonString.split(",");

        // Create Map
        Map<String, String> map = new HashMap<>();
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            map.put(keyValue[0].trim(), keyValue[1].trim());
        }

        return map;
    }

    public static void main(String[] args) {

        List<String> constants = Arrays.asList(
                "SEND_DOWNLOAD_BUTTON_ICON", "SEND_DOWNLOAD_BUTTON", "APPLICATION_TRACKER_SUBITEM_TITLE_BLUE",
                "APPLICATION_TRACKER_SUBITEM_TITLE_GREEN", "APPLICATION_TRACKER_DATA", "APPLICATION_TRACKER_TITLE",
                "APPLICATION_TRACKER_SUBTITLE", "APPLICATION_TRACKER_SUBITEM_TITLE_YELLOW", "APPLICATION_TRACKER_SUBITEM_TITLE_RED",
                "APPLICATION_SWITCHER_TITLE", "SELECTED_APPLICATION_SWITCHER_TITLE", "EMI_DETAILS_PARTIALLY_PAID_TICK_ICON",
                "EMI_DETAILS_PARTIALLY_PAID_STATUS", "EMI_DETAILS_PARTIALLY_PAID_STATUS_PARAM", "EMI_DETAILS_PAID_TICK_ICON",
                "EMI_DETAILS_PAID_STATUS", "EMI_DETAILS_PAID_STATUS_PARAM", "EMI_DETAILS_AMOUNT_TITLE", "EMI_DETAILS_SUBITEMS_DATA",
                "EMI_DETAILS_SUBITEMS_DATA_PARAM", "OVERDUE_EMI_BOTTOMBAR_TITLE_AMOUNT", "OVERDUE_EMI_BOTTOMBAR_TITLE",
                "COMMON_BUTTON_STYLE", "OVERDUE_EMI_BOTTOMBAR", "OVERDUE_EMI_BOTTOMBAR_CONTAINER", "EMI_DETAILS_SCHEDULED_ICON",
                "EMI_DETAILS_PROCESSING_ICON", "EMI_LIST_SUBITEMS_TAG_TITLE", "EMI_LIST_SUBITEMS_TAG_TITLE_PARAM", "EMI_LIST_HEADER_TITLE",
                "AMOUNT_PARAM", "AMOUNT", "EMI_OVERDUE_SUBITEM_HEADER", "OVERDUE_EMI_BOTTOMBAR_HEADER_OUT", "EMI_OVERDUE_SUBITEM_AMOUNT",
                "EMI_OVERDUE_SUBITEM_NAME", "EMI_OVERDUE_SUBITEM_TOTAL_AMOUNT", "OVERDUE_EMI_BOTTOMBAR_TOTAL_OVERDUE_OUT",
                "EMI_OVERDUE_SUBITEM_TOTAL_TITLE", "OVERDUE_EMI_BOTTOMBAR_SUBITEM_OUT", "EMI_DETAILS_OVERDUE_ICON",
                "EMI_DETAILS_SCHEDULED_STATUS_PARAM", "EMI_DETAILS_SCHEDULED_STATUS", "DUE_APPROACH_STATUS", "DUE_APPROACH_STATUS_PARAM",
                "EMI_DETAILS_OVERDUE_STATUS_PARAM", "EMI_DETAILS_OVERDUE_STATUS", "EMI_DETAILS_PROCESSING_STATUS_PARAM",
                "EMI_DETAILS_PROCESSING_STATUS", "HOME_FAQ_SUBITEMS_TITLE", "HOME_FAQ_SUBITEMS_SUBTITLE", "HOME_FAQ_BUTTON",
                "HOME_FAQ_TITLE", "HOME_VIEW_LOAN", "LOAN_SWITCHER_LIST_ICON", "LOAN_SWITCHER_LIST_TITLE_PARAM", "LOAN_SWITCHER_LIST_TITLE",
                "LOAN_SWITCHER_LIST_CLOSED_DATA_PARAM", "LOAN_SWITCHER_LIST_CURRENT_DATA_PARAM", "LOAN_SWITCHER_LIST_CLOSED_DATA",
                "LOAN_SWITCHER_LIST_CURRENT_DATA", "LOAN_SWITCHER_SELECT_LOAN_TITLE", "LOAN_SWITCHER_LIST_SUBITEM_DATA",
                "LOAN_SWITCHER_SELECT_LOAN_ICON", "LOAN_SWITCHER_LIST_SUBITEM_PARAM", "MY_LOAN_AUTOPAY", "MY_LOAN_AUTOPAY_ENABLED",
                "ICON_INFO_GRAY", "MY_LOAN_AUTOPAY_PARAM_2", "MY_LOAN_AUTOPAY_PARAM_1", "MY_LOAN_AUTOPAY_DATA", "MY_LOAN_AUTOPAY_DISABLED",
                "MY_LOAN_EMI_TRACKER_OVERDUE", "MY_LOAN_EMI_TRACKER_DUE_GRAY", "MY_LOAN_EMI_TRACKER_TITLE_OVERDUE_PARAM",
                "MY_LOAN_EMI_TRACKER_TITLE_OVERDUE", "MY_LOAN_EMI_TRACKER_TITLE_DUE_GRAY_PARAM", "MY_LOAN_EMI_TRACKER_TITLE_DUE_GRAY",
                "DUE_IN_STYLE_YELLOW", "DUE_IN_ICON_YELLOW", "PROCESSING_STATUS_STYLE", "MY_LOAN_EMI_STATUS_PROCESSING",
                "MY_LOAN_EMI_STATUS_PROCESSING_TITLE", "DUE_IN_TITLE_YELLOW", "MY_LOAN_EMI_STATUS", "OVERDUE_EMI_BOTTOMBAR_LATEFEE_OUT",
                "DUE_IN_ICON_GRAY", "OTHER_OPTIONS_SUBITEMS_TITLE", "SUBSECTION_NAVIGATION_ICON", "LOAN_DOCUMENTS_SUBTITLE",
                "MY_LOAN_DOCUMENTS_WIDGET_STYLE", "MY_LOAN_EMI_AMOUNT", "EMI_AMOUNT_TITLE", "EMI_AMOUNT_DATA_DYNAMIC_PARAM1",
                "CURRENT_LOAN_NAVIGATION_ICON", "CURRENT_LOAN_NAVIGATION_TITLE", "LOAN_CLOSED_CARD_ICON", "REPAYMENT_SCHEDULE_HEADER",
                "CANCEL_BUTTON_ICON_16PX", "REPAYMENT_SCHEDULE", "REPAYMENT_SCHEDULE_TITLE", "REPAYMENT_SCHEDULE_DOWNLOAD_ICON",
                "DOWNLOAD_TITLE", "DOWNLOAD_BUTTON_ICON_24PX", "SEND_DOWNLOAD_BUTTON_TITLE", "SEND_DOWNLOAD_BUTTON_ICON",
                "SEND_DOWNLOAD_BUTTON", "LOAN_REQUEST_DOCUMENT_MESSAGE_EMAIL", "LOAN_REQUEST_DOCUMENT_MESSAGE", "LOAN_DOCUMENT_DATE_RANGE",
                "LOAN_DOCUMENT_FORMAT", "REQUEST_DOCUMENT_DROPDOWN", "REQUEST_DOCUMENT_DROPDOWN_TITLE", "REQUEST_DOCUMENT_DROPDOWN_ICON",
                "REQUEST_DOCUMENT_DROPDOWN_SELECTED_TITLE", "REQUEST_DOCUMENT_NON_SELECTED_VALUE", "REQUEST_DOCUMENT_DROPDOWN_SUBTITLE",
                "TRANSACTION_HISTORY_LIST_SUBITEMS_DATA", "TRANSACTION_HISTORY_LIST_SUBTITLE_PAID", "TRANSACTION_HISTORY_LIST_SUBTITLE_PARAM_PAID",
                "TRANSACTION_HISTORY_LIST_SUBITEMS_DATA_PARAM", "TRANSACTION_EMI_DETAILS_AMOUNT_TITLE", "TRANSACTION_EMI_DETAILS_ICON",
                "TRANSACTION_HISTORY_LIST_TITLE", "TRANSACTION_HISTORY_LIST_ICON", "TRANSACTION_HISTORY_LIST_DATA_PARAM",
                "TRANSACTION_HISTORY_LIST_DATA", "TRANSACTION_HISTORY_LIST_SUBTITLE_FAILED", "TRANSACTION_HISTORY_LIST_SUBTITLE_PARAM_FAILED",
                "MY_LOAN_EMI_STATUS_SUBTITLE_PARAM_SUCCESS", "MY_LOAN_EMI_STATUS_SUBTITLE_SUCCESS", "MY_LOAN_EMI_STATUS_TITLE_SUCCESS",
                "MY_LOAN_EMI_STATUS_TITLE_PARAM_SUCCESS", "MY_LOAN_EMI_STATUS_ICON_SUCCESSFULLY", "MY_LOAN_EMI_STATUS_SUCCESS",
                "MY_LOAN_EMI_STATUS_SUBTITLE_OVERDUE", "MY_LOAN_EMI_STATUS_TITLE_PARAM_OVERDUE", "MY_LOAN_EMI_STATUS_TITLE_OVERDUE",
                "MY_LOAN_EMI_STATUS_ICON_OVERDUE", "MY_LOAN_EMI_STATUS_OVERDUE", "MY_LOAN_EMI_STATUS_SUBTITLE_PROCESSING",
                "MY_LOAN_EMI_STATUS_SUBTITLE_PARAM_PROCESSING", "MY_LOAN_EMI_STATUS_TITLE_PARAM_PROCESSING", "MY_LOAN_EMI_STATUS_TITLE_PROCESSING",
                "MY_LOAN_EMI_STATUS_ICON_PROCESSING", "DOCUMENT_DOWNLOAD_WITH_DOWNLOAD_LINK", "APPLICATIONS_SCREEN_NULL_STATE",
                "MY_LOANS_STYLE_WITH_EMI_CARD", "MY_LOANS_STYLE_WITH_OVERDUE_CARD", "SCHEDULE_TITLE_PARAM", "SCHEDULE_TITLE",
                "SCHEDULED_BACKGROUND", "DOWNLOAD_ICON_WHITE", "FOOTER_STYLE", "BRAND_ICON_FOOTER"
        );
        String jsonStyle = "{\n" +
                "    \"APPLICATION_TRACKER_SUBITEM_TITLE_BLUE\": \"APPLICATION_TRACKER_SUBITEM_TITLE_BLUE\",\n" +
                "    \"APPLICATION_TRACKER_SUBITEM_TITLE_GREEN\": \"APPLICATION_TRACKER_SUBITEM_TITLE_GREEN\",\n" +
                "    \"APPLICATION_TRACKER_DATA\": \"APPLICATION_TRACKER_DATA\",\n" +
                "    \"APPLICATION_TRACKER_TITLE\": \"APPLICATION_TRACKER_TITLE\",\n" +
                "    \"APPLICATION_TRACKER_SUBTITLE\": \"APPLICATION_TRACKER_SUBTITLE\",\n" +
                "    \"APPLICATION_TRACKER_SUBITEM_TITLE_YELLOW\": \"APPLICATION_TRACKER_SUBITEM_TITLE_YELLOW\",\n" +
                "    \"APPLICATION_TRACKER_SUBITEM_TITLE_RED\": \"APPLICATION_TRACKER_SUBITEM_TITLE_RED\",\n" +
                "    \"APPLICATION_SWITCHER_TITLE\": \"APPLICATION_SWITCHER_TITLE\",\n" +
                "    \"SELECTED_APPLICATION_SWITCHER_TITLE\": \"SELECTED_APPLICATION_SWITCHER_TITLE\",\n" +
                "    \"EMI_DETAILS_PARTIALLY_PAID_TICK_ICON\": \"EMI_DETAILS_PARTIALLY_PAID_TICK_ICON\",\n" +
                "    \"EMI_DETAILS_PARTIALLY_PAID_STATUS\": \"EMI_DETAILS_PARTIALLY_PAID_STATUS\",\n" +
                "    \"EMI_DETAILS_PARTIALLY_PAID_STATUS_PARAM\": \"EMI_DETAILS_PARTIALLY_PAID_STATUS_PARAM\",\n" +
                "    \"EMI_DETAILS_PAID_TICK_ICON\": \"EMI_DETAILS_PAID_TICK_ICON\",\n" +
                "    \"EMI_DETAILS_PAID_STATUS\": \"EMI_DETAILS_PAID_STATUS\",\n" +
                "    \"EMI_DETAILS_PAID_STATUS_PARAM\": \"EMI_DETAILS_PAID_STATUS_PARAM\",\n" +
                "    \"EMI_DETAILS_AMOUNT_TITLE\": \"EMI_DETAILS_AMOUNT_TITLE\",\n" +
                "    \"EMI_DETAILS_SUBITEMS_DATA\": \"EMI_DETAILS_SUBITEMS_DATA\",\n" +
                "    \"EMI_DETAILS_SUBITEMS_DATA_PARAM\": \"EMI_DETAILS_SUBITEMS_DATA_PARAM\",\n" +
                "    \"OVERDUE_EMI_BOTTOMBAR_TITLE_AMOUNT\": \"OVERDUE_EMI_BOTTOMBAR_TITLE_AMOUNT\",\n" +
                "    \"OVERDUE_EMI_BOTTOMBAR_TITLE\": \"OVERDUE_EMI_BOTTOMBAR_TITLE\",\n" +
                "    \"COMMON_BUTTON_STYLE\": \"COMMON_BUTTON_STYLE\",\n" +
                "    \"OVERDUE_EMI_BOTTOMBAR\": \"OVERDUE_EMI_BOTTOMBAR\",\n" +
                "    \"OVERDUE_EMI_BOTTOMBAR_CONTAINER\": \"OVERDUE_EMI_BOTTOMBAR_CONTAINER\",\n" +
                "    \"EMI_DETAILS_SCHEDULED_ICON\": \"EMI_DETAILS_SCHEDULED_ICON\",\n" +
                "    \"EMI_DETAILS_PROCESSING_ICON\": \"EMI_DETAILS_PROCESSING_ICON\",\n" +
                "    \"EMI_LIST_SUBITEMS_TAG_TITLE\": \"EMI_LIST_SUBITEMS_TAG_TITLE\",\n" +
                "    \"EMI_LIST_SUBITEMS_TAG_TITLE_PARAM\": \"EMI_LIST_SUBITEMS_TAG_TITLE_PARAM\",\n" +
                "    \"EMI_LIST_HEADER_TITLE\": \"EMI_LIST_HEADER_TITLE\",\n" +
                "    \"AMOUNT_PARAM\": \"AMOUNT_PARAM\",\n" +
                "    \"AMOUNT\": \"AMOUNT\",\n" +
                "    \"EMI_OVERDUE_SUBITEM_HEADER\": \"EMI_OVERDUE_SUBITEM_HEADER\",\n" +
                "    \"OVERDUE_EMI_BOTTOMBAR_HEADER_OUT\": \"OVERDUE_EMI_BOTTOMBAR_HEADER_OUT\",\n" +
                "    \"EMI_OVERDUE_SUBITEM_AMOUNT\": \"EMI_OVERDUE_SUBITEM_AMOUNT\",\n" +
                "    \"EMI_OVERDUE_SUBITEM_NAME\": \"EMI_OVERDUE_SUBITEM_NAME\",\n" +
                "    \"EMI_OVERDUE_SUBITEM_TOTAL_AMOUNT\": \"EMI_OVERDUE_SUBITEM_TOTAL_AMOUNT\",\n" +
                "    \"OVERDUE_EMI_BOTTOMBAR_TOTAL_OVERDUE_OUT\": \"OVERDUE_EMI_BOTTOMBAR_TOTAL_OVERDUE_OUT\",\n" +
                "    \"EMI_OVERDUE_SUBITEM_TOTAL_TITLE\": \"EMI_OVERDUE_SUBITEM_TOTAL_TITLE\",\n" +
                "    \"OVERDUE_EMI_BOTTOMBAR_SUBITEM_OUT\": \"OVERDUE_EMI_BOTTOMBAR_SUBITEM_OUT\",\n" +
                "    \"EMI_DETAILS_OVERDUE_ICON\": \"EMI_DETAILS_OVERDUE_ICON\",\n" +
                "    \"HOME_FAQ_SUBITEMS_TITLE\": \"HOME_FAQ_SUBITEMS_TITLE\",\n" +
                "    \"HOME_FAQ_SUBITEMS_SUBTITLE\": \"HOME_FAQ_SUBITEMS_SUBTITLE\",\n" +
                "    \"HOME_FAQ_BUTTON\": \"HOME_FAQ_BUTTON\",\n" +
                "    \"HOME_FAQ_TITLE\": \"HOME_FAQ_TITLE\",\n" +
                "    \"HOME_VIEW_LOAN\": \"HOME_VIEW_LOAN\",\n" +
                "    \"LOAN_SWITCHER_LIST_ICON\": \"LOAN_SWITCHER_LIST_ICON\",\n" +
                "    \"LOAN_SWITCHER_LIST_TITLE_PARAM\": \"LOAN_SWITCHER_LIST_TITLE_PARAM\",\n" +
                "    \"LOAN_SWITCHER_LIST_TITLE\": \"LOAN_SWITCHER_LIST_TITLE\",\n" +
                "    \"LOAN_SWITCHER_LIST_CLOSED_DATA_PARAM\": \"LOAN_SWITCHER_LIST_CLOSED_DATA_PARAM\",\n" +
                "    \"LOAN_SWITCHER_LIST_CURRENT_DATA_PARAM\": \"LOAN_SWITCHER_LIST_CURRENT_DATA_PARAM\",\n" +
                "    \"LOAN_SWITCHER_LIST_CLOSED_DATA\": \"LOAN_SWITCHER_LIST_CLOSED_DATA\",\n" +
                "    \"LOAN_SWITCHER_LIST_CURRENT_DATA\": \"LOAN_SWITCHER_LIST_CURRENT_DATA\",\n" +
                "    \"LOAN_SWITCHER_SELECT_LOAN_TITLE\": \"LOAN_SWITCHER_SELECT_LOAN_TITLE\",\n" +
                "    \"LOAN_SWITCHER_LIST_SUBITEM_DATA\": \"LOAN_SWITCHER_LIST_SUBITEM_DATA\",\n" +
                "    \"LOAN_SWITCHER_SELECT_LOAN_ICON\": \"LOAN_SWITCHER_SELECT_LOAN_ICON\",\n" +
                "    \"LOAN_SWITCHER_LIST_SUBITEM_PARAM\": \"LOAN_SWITCHER_LIST_SUBITEM_PARAM\",\n" +
                "    \"MY_LOAN_AUTOPAY\": \"MY_LOAN_AUTOPAY\",\n" +
                "    \"MY_LOAN_AUTOPAY_ENABLED\": \"MY_LOAN_AUTOPAY_ENABLED\",\n" +
                "    \"ICON_INFO_GRAY\": \"ICON_INFO_GRAY\",\n" +
                "    \"MY_LOAN_AUTOPAY_PARAM_2\": \"MY_LOAN_AUTOPAY_PARAM_2\",\n" +
                "    \"MY_LOAN_AUTOPAY_PARAM_1\": \"MY_LOAN_AUTOPAY_PARAM_1\",\n" +
                "    \"MY_LOAN_AUTOPAY_DATA\": \"MY_LOAN_AUTOPAY_DATA\",\n" +
                "    \"MY_LOAN_AUTOPAY_DISABLED\": \"MY_LOAN_AUTOPAY_DISABLED\",\n" +
                "    \"MY_LOAN_EMI_TRACKER_OVERDUE\": \"MY_LOAN_EMI_TRACKER_OVERDUE\",\n" +
                "    \"MY_LOAN_EMI_TRACKER_DUE_GRAY\": \"MY_LOAN_EMI_TRACKER_DUE_GRAY\",\n" +
                "    \"MY_LOAN_EMI_TRACKER_TITLE_OVERDUE_PARAM\": \"MY_LOAN_EMI_TRACKER_TITLE_OVERDUE_PARAM\",\n" +
                "    \"MY_LOAN_EMI_TRACKER_TITLE_OVERDUE\": \"MY_LOAN_EMI_TRACKER_TITLE_OVERDUE\",\n" +
                "    \"MY_LOAN_EMI_TRACKER_TITLE_DUE_GRAY_PARAM\": \"MY_LOAN_EMI_TRACKER_TITLE_DUE_GRAY_PARAM\",\n" +
                "    \"MY_LOAN_EMI_TRACKER_TITLE_DUE_GRAY\": \"MY_LOAN_EMI_TRACKER_TITLE_DUE_GRAY\",\n" +
                "    \"DUE_IN_STYLE_YELLOW\": \"DUE_IN_STYLE_YELLOW\",\n" +
                "    \"DUE_IN_ICON_YELLOW\": \"DUE_IN_ICON_YELLOW\",\n" +
                "    \"PROCESSING_STATUS_STYLE\": \"PROCESSING_STATUS_STYLE\",\n" +
                "    \"MY_LOAN_EMI_STATUS_PROCESSING\": \"MY_LOAN_EMI_STATUS_PROCESSING\",\n" +
                "    \"MY_LOAN_EMI_STATUS_PROCESSING_TITLE\": \"MY_LOAN_EMI_STATUS_PROCESSING_TITLE\",\n" +
                "    \"DUE_IN_TITLE_YELLOW\": \"DUE_IN_TITLE_YELLOW\",\n" +
                "    \"MY_LOAN_EMI_STATUS\": \"MY_LOAN_EMI_STATUS\",\n" +
                "    \"OVERDUE_EMI_BOTTOMBAR_LATEFEE_OUT\": \"OVERDUE_EMI_BOTTOMBAR_LATEFEE_OUT\",\n" +
                "    \"DUE_IN_ICON_GRAY\": \"DUE_IN_ICON_GRAY\",\n" +
                "    \"DOCUMENT_DOWNLOAD_WITH_DOWNLOAD_LINK\": \"DOCUMENT_DOWNLOAD_WITH_DOWNLOAD_LINK\",\n" +
                "    \"APPLICATIONS_SCREEN_NULL_STATE\": \"APPLICATIONS_SCREEN_NULL_STATE\",\n" +
                "    \"MY_LOANS_STYLE_WITH_EMI_CARD\": \"MY_LOANS_STYLE_WITH_EMI_CARD\",\n" +
                "    \"MY_LOANS_STYLE_WITH_OVERDUE_CARD\": \"MY_LOANS_STYLE_WITH_OVERDUE_CARD\",\n" +
                "    \"REQUEST_DOCUMENT_DROPDOWN_SUBTITLE\": \"REQUEST_DOCUMENT_DROPDOWN_SUBTITLE\",\n" +
                "    \"EMI_DETAILS_PROCESSING_STATUS\": \"EMI_DETAILS_PROCESSING_STATUS\",\n" +
                "    \"EMI_DETAILS_PROCESSING_STATUS_PARAM\": \"EMI_DETAILS_PROCESSING_STATUS_PARAM\",\n" +
                "    \"EMI_DETAILS_OVERDUE_STATUS\": \"EMI_DETAILS_OVERDUE_STATUS\",\n" +
                "    \"EMI_DETAILS_OVERDUE_STATUS_PARAM\": \"EMI_DETAILS_OVERDUE_STATUS_PARAM\",\n" +
                "    \"DUE_APPROACH_STATUS\": \"DUE_APPROACH_STATUS\",\n" +
                "    \"DUE_APPROACH_STATUS_PARAM\": \"DUE_APPROACH_STATUS_PARAM\",\n" +
                "    \"EMI_DETAILS_SCHEDULED_STATUS\": \"EMI_DETAILS_SCHEDULED_STATUS\",\n" +
                "    \"EMI_DETAILS_SCHEDULED_STATUS_PARAM\": \"EMI_DETAILS_SCHEDULED_STATUS_PARAM\",\n" +
                "    \"EMI_DETAILS_SCHEDULED_STATUS_PARAM\": \"EMI_DETAILS_SCHEDULED_STATUS_PARAM\",\n" +
                "    \"EMI_DETAILS_SCHEDULED_STATUS\": \"EMI_DETAILS_SCHEDULED_STATUS\",\n" +
                "    \"DUE_APPROACH_STATUS\": \"DUE_APPROACH_STATUS\",\n" +
                "    \"DUE_APPROACH_STATUS_PARAM\": \"DUE_APPROACH_STATUS_PARAM\",\n" +
                "    \"EMI_DETAILS_OVERDUE_STATUS_PARAM\": \"EMI_DETAILS_OVERDUE_STATUS_PARAM\",\n" +
                "    \"EMI_DETAILS_OVERDUE_STATUS\": \"EMI_DETAILS_OVERDUE_STATUS\",\n" +
                "    \"EMI_DETAILS_PROCESSING_STATUS_PARAM\": \"EMI_DETAILS_PROCESSING_STATUS_PARAM\",\n" +
                "    \"EMI_DETAILS_PROCESSING_STATUS\": \"EMI_DETAILS_PROCESSING_STATUS\",\n" +
                "    \"MY_LOAN_EMI_STATUS_TITLE_OVERDUE\": \"MY_LOAN_EMI_STATUS_TITLE_OVERDUE\",\n" +
                "    \"MY_LOAN_EMI_STATUS_TITLE_PARAM_OVERDUE\": \"MY_LOAN_EMI_STATUS_TITLE_PARAM_OVERDUE\",\n" +
                "    \"MY_LOAN_EMI_STATUS_OVERDUE\": \"MY_LOAN_EMI_STATUS_OVERDUE\",\n" +
                "    \"MY_LOAN_EMI_STATUS_ICON_OVERDUE\": \"MY_LOAN_EMI_STATUS_ICON_OVERDUE\",\n" +
                "    \"MY_LOAN_EMI_STATUS_SUBTITLE_PARAM_SUCCESS\": \"MY_LOAN_EMI_STATUS_SUBTITLE_PARAM_SUCCESS\",\n" +
                "    \"MY_LOAN_EMI_STATUS_SUBTITLE_OVERDUE\": \"MY_LOAN_EMI_STATUS_SUBTITLE_OVERDUE\",\n" +
                "    \"MY_LOAN_EMI_STATUS_SUCCESS\": \"MY_LOAN_EMI_STATUS_SUCCESS\",\n" +
                "    \"MY_LOAN_EMI_STATUS_ICON_SUCCESSFULLY\": \"MY_LOAN_EMI_STATUS_ICON_SUCCESSFULLY\",\n" +
                "    \"MY_LOAN_EMI_STATUS_TITLE_PARAM_SUCCESS\": \"MY_LOAN_EMI_STATUS_TITLE_PARAM_SUCCESS\",\n" +
                "    \"MY_LOAN_EMI_STATUS_TITLE_SUCCESS\": \"MY_LOAN_EMI_STATUS_TITLE_SUCCESS\",\n" +
                "    \"MY_LOAN_EMI_STATUS_SUBTITLE_SUCCESS\": \"MY_LOAN_EMI_STATUS_SUBTITLE_SUCCESS\",\n" +
                "    \"MY_LOAN_EMI_STATUS_ICON_PROCESSING\": \"MY_LOAN_EMI_STATUS_ICON_PROCESSING\",\n" +
                "    \"MY_LOAN_EMI_STATUS_TITLE_PARAM_PROCESSING\": \"MY_LOAN_EMI_STATUS_TITLE_PARAM_PROCESSING\",\n" +
                "    \"MY_LOAN_EMI_STATUS_TITLE_PROCESSING\": \"MY_LOAN_EMI_STATUS_TITLE_PROCESSING\",\n" +
                "    \"MY_LOAN_EMI_STATUS_SUBTITLE_PARAM_PROCESSING\": \"MY_LOAN_EMI_STATUS_SUBTITLE_PARAM_PROCESSING\",\n" +
                "    \"REPAYMENT_SCHEDULE_DOWNLOAD_ICON\": \"REPAYMENT_SCHEDULE_DOWNLOAD_ICON\",\n" +
                "    \"DOWNLOAD_TITLE\": \"DOWNLOAD_TITLE\",\n" +
                "    \"TRANSACTION_EMI_DETAILS_ICON\": \"TRANSACTION_EMI_DETAILS_ICON\",\n" +
                "    \"REQUEST_DOCUMENT_DROPDOWN_SELECTED_TITLE\": \"REQUEST_DOCUMENT_DROPDOWN_SELECTED_TITLE\",\n" +
                "    \"LOAN_DOCUMENT_FORMAT\": \"LOAN_DOCUMENT_FORMAT\",\n" +
                "    \"TRANSACTION_HISTORY_LIST_SUBITEMS_DATA\": \"TRANSACTION_HISTORY_LIST_SUBITEMS_DATA\",\n" +
                "    \"TRANSACTION_HISTORY_LIST_SUBTITLE_FAILED\": \"TRANSACTION_HISTORY_LIST_SUBTITLE_FAILED\",\n" +
                "    \"SEND_DOWNLOAD_BUTTON\": \"SEND_DOWNLOAD_BUTTON\",\n" +
                "    \"REPAYMENT_SCHEDULE_TITLE\": \"REPAYMENT_SCHEDULE_TITLE\",\n" +
                "    \"REQUEST_DOCUMENT_NON_SELECTED_VALUE\": \"REQUEST_DOCUMENT_NON_SELECTED_VALUE\",\n" +
                "    \"TRANSACTION_HISTORY_LIST_ICON\": \"TRANSACTION_HISTORY_LIST_ICON\",\n" +
                "    \"TRANSACTION_EMI_DETAILS_AMOUNT_TITLE\": \"TRANSACTION_EMI_DETAILS_AMOUNT_TITLE\",\n" +
                "    \"TRANSACTION_HISTORY_LIST_SUBITEMS_DATA_PARAM\": \"TRANSACTION_HISTORY_LIST_SUBITEMS_DATA_PARAM\",\n" +
                "    \"LOAN_DOCUMENT_DATE_RANGE\": \"LOAN_DOCUMENT_DATE_RANGE\",\n" +
                "    \"CANCEL_BUTTON_ICON_16PX\": \"CANCEL_BUTTON_ICON_16PX\",\n" +
                "    \"MY_LOAN_EMI_STATUS_SUBTITLE_PROCESSING\": \"MY_LOAN_EMI_STATUS_SUBTITLE_PROCESSING\",\n" +
                "    \"LOAN_REQUEST_DOCUMENT_MESSAGE\": \"LOAN_REQUEST_DOCUMENT_MESSAGE\",\n" +
                "    \"TRANSACTION_HISTORY_LIST_SUBTITLE_PAID\": \"TRANSACTION_HISTORY_LIST_SUBTITLE_PAID\",\n" +
                "    \"TRANSACTION_HISTORY_LIST_DATA\": \"TRANSACTION_HISTORY_LIST_DATA\",\n" +
                "    \"SEND_DOWNLOAD_BUTTON_TITLE\": \"SEND_DOWNLOAD_BUTTON_TITLE\",\n" +
                "    \"REQUEST_DOCUMENT_DROPDOWN_ICON\": \"REQUEST_DOCUMENT_DROPDOWN_ICON\",\n" +
                "    \"SEND_DOWNLOAD_BUTTON_ICON\": \"SEND_DOWNLOAD_BUTTON_ICON\",\n" +
                "    \"REQUEST_DOCUMENT_DROPDOWN\": \"REQUEST_DOCUMENT_DROPDOWN\",\n" +
                "    \"REPAYMENT_SCHEDULE\": \"REPAYMENT_SCHEDULE\",\n" +
                "    \"DOWNLOAD_BUTTON_ICON_24PX\": \"DOWNLOAD_BUTTON_ICON_24PX\",\n" +
                "    \"REQUEST_DOCUMENT_DROPDOWN_TITLE\": \"REQUEST_DOCUMENT_DROPDOWN_TITLE\",\n" +
                "    \"TRANSACTION_HISTORY_LIST_SUBTITLE_PARAM_FAILED\": \"TRANSACTION_HISTORY_LIST_SUBTITLE_PARAM_FAILED\",\n" +
                "    \"LOAN_REQUEST_DOCUMENT_MESSAGE_EMAIL\": \"LOAN_REQUEST_DOCUMENT_MESSAGE_EMAIL\",\n" +
                "    \"TRANSACTION_HISTORY_LIST_SUBTITLE_PARAM_PAID\": \"TRANSACTION_HISTORY_LIST_SUBTITLE_PARAM_PAID\",\n" +
                "    \"TRANSACTION_HISTORY_LIST_TITLE\": \"TRANSACTION_HISTORY_LIST_TITLE\",\n" +
                "    \"TRANSACTION_HISTORY_LIST_DATA_PARAM\": \"TRANSACTION_HISTORY_LIST_DATA_PARAM\",\n" +
                "    \"REPAYMENT_SCHEDULE_HEADER\": \"REPAYMENT_SCHEDULE_HEADER\",\n" +
                "    \"SCHEDULE_TITLE_PARAM\": \"SCHEDULE_TITLE_PARAM\",\n" +
                "    \"SCHEDULE_TITLE\": \"SCHEDULE_TITLE\",\n" +
                "    \"SCHEDULED_BACKGROUND\": \"SCHEDULED_BACKGROUND\",\n" +
                "    \"FOOTER_STYLE\": \"FOOTER_STYLE\",\n" +
                "    \"BRAND_ICON_FOOTER\": \"BRAND_ICON_FOOTER\"\n" +
                "}";
        String jsonIcon = "{     \"EMI_DETAILS_PARTIALLY_PAID_STATUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/partially_paid_status_icon.svg\",     \"EMI_DETAILS_PAID_STATUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/paid_status_icon.svg\",     \"EMI_PAYMENT_LIST_PAID_STATUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/paid_status_icon.svg\",     \"EMI_PAYMENT_LIST_PARTIALLY_PAID_STATUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/partially_paid_status_icon.svg\",     \"EMI_PAYMENT_LIST_PROCESSING_STATUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/processing_status_icon.svg\",     \"EMI_PAYMENT_LIST_OVERDUR_STATUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/overdue_status_icon.svg\",     \"EMI_PAYMENT_LIST_DUE_APPROACH_STATUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/calander_blue.svg\",     \"EMI_PAYMENT_LIST_SCHEDULED_STATUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/calander_blue.svg\",     \"EMI_PAYMENT_LIST_RIGHT_ARROW_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/right_arrow_black.svg\",     \"EMI_STATUS_CARD_OVERDUE_STATUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/overdue.svg\",     \"EMI_STATUS_CARD_PROCESSING_STATUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/proccessing_icon.svg\",     \"EMI_STATUS_CARD_SUCCESS_STATUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/right_green_icon.svg\",     \"FAQ_MAXIMIZE_PLUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/black_plus_icon.svg\",     \"FAQ_MINIMIZE_MINUS_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/black_minus_icon.svg\",     \"LOAN_DOCUMENTS_RIGHT_ARROW_BLACK_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/right_arrow_black.svg\",     \"LOAN_SWITCHER_COPY_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/icon_copy.svg\",     \"AUTO_PAY_INFO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/icon_info_gray.svg\",     \"EMI_TRACKER_DUE_DAYS_CLOCK_GREY\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/lottie/clock_grey.json\",     \"EMI_TRACKER_DUE_DAYS_CLOCK_YELLOW\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/lottie/clock_dark_yellow.json\",     \"EMI_PAYMENT_LIST_RPS_DOWNLOAD_BUTTON_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/download_icon_24px.svg\",     \"EMI_PAYMENT_LIST_RPS_CANCEL_BUTTON_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/icon_black_cross.svg\",     \"LOAN_DOCUMENTS_DOWNLOAD_BUTTON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/icon_download_blue_20px.svg\",     \"LOAN_DOCUMENTS_SEND_EMAIL_BUTTON_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/icon_email_blue_16px.svg\",     \"LOAN_DOCUMENTS_DOWNLOAD_DOWN_ARROW_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/icon_down_arrow_16px.svg\",     \"LK_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/lk_disbursed_logo.png\",     \"PNB_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/pnb_co_lender_logo.png\",     \"CAN_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/canara_bank_co_lender_logo.png\",     \"IDFC_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/idfc_bank_co_lender_logo.png\",     \"CHOLA_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/chola_co_lender_logo.png\",     \"BOI_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/boi_co_lender_logo.png\",     \"POONAWALLA_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/poonawalla_fincorp_co_lender_logo.png\",     \"DHANVARSHA_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/dhanvarsha_co_lender_logo.png\",     \"BOM_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/bom_co_lender_logo.png\",     \"AMBIT_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/ambit_finvest_co_lender_logo.png\",     \"SURYODAY_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/suryoday_co_lender_logo.png\",     \"SBM_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/sbm_bank_co_lender_logo.png\",     \"NORTHERN_ARC_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/northern_arc_co_lender_logo.png\",     \"UGRO_LOGO_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/ugro_capital_co_lender_logo.png\",     \"LOAN_DOCUMENT_PDF_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/loan_documents_icon.svg\",     \"PNB_BANK_CO_LENDER_ICON\": \"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/pnb_co_lender_logo.png\",   \"DOWNLOAD_ICON_WHITE\":\"https://uat-assets.lendingkart.com/assets/mobilebff/assets/images/download_icon_white_15px.svg\"}";
        List<String> iconConstants = new ArrayList<>(Arrays.asList(
                "EMI_DETAILS_PARTIALLY_PAID_STATUS_ICON",
                "EMI_DETAILS_PAID_STATUS_ICON",
                "EMI_PAYMENT_LIST_PAID_STATUS_ICON",
                "EMI_PAYMENT_LIST_PARTIALLY_PAID_STATUS_ICON",
                "EMI_PAYMENT_LIST_PROCESSING_STATUS_ICON",
                "EMI_PAYMENT_LIST_OVERDUR_STATUS_ICON",
                "EMI_PAYMENT_LIST_DUE_APPROACH_STATUS_ICON",
                "EMI_PAYMENT_LIST_SCHEDULED_STATUS_ICON",
                "EMI_PAYMENT_LIST_RIGHT_ARROW_ICON",
                "EMI_STATUS_CARD_OVERDUE_STATUS_ICON",
                "EMI_STATUS_CARD_PROCESSING_STATUS_ICON",
                "EMI_STATUS_CARD_SUCCESS_STATUS_ICON",
                "FAQ_MAXIMIZE_PLUS_ICON",
                "FAQ_MINIMIZE_MINUS_ICON",
                "LOAN_DOCUMENTS_RIGHT_ARROW_BLACK_ICON",
                "LOAN_SWITCHER_COPY_ICON",
                "AUTO_PAY_INFO_ICON",
                "EMI_TRACKER_DUE_DAYS_CLOCK_GREY",
                "EMI_TRACKER_DUE_DAYS_CLOCK_YELLOW",
                "EMI_PAYMENT_LIST_RPS_CANCEL_BUTTON_ICON",
                "EMI_PAYMENT_LIST_RPS_DOWNLOAD_BUTTON_ICON",
                "LOAN_DOCUMENTS_DOWNLOAD_BUTTON",
                "LOAN_DOCUMENTS_SEND_EMAIL_BUTTON_ICON",
                "LOAN_DOCUMENTS_DOWNLOAD_DOWN_ARROW_ICON",
                "LK_LOGO_ICON",
                "LOAN_DOCUMENT_PDF_ICON"
        ));
        Map<String, String> map = addValueInMap(jsonIcon);

        findMissingKey(iconConstants, map);
    }
}
