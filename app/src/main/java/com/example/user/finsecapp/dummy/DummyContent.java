package com.example.user.finsecapp.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    //private static final int COUNT = 10;

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1","CANARA BANK","Bank balance Check:\n9015483483\n\nMini statement:\n9015734734\n\nCustomer care:\n18004250018\n\nWebsite:\nhttp://www.canarabank.com "));
        addItem(new DummyItem("2", "CENTRAL BANK oF INDIA","Bank balance Check:\n9222250000\n\nMini statement:\n9555144441\n\nCustomer care:\n18002001911\n\nWebsite:\nhttp://www.centralbankofindia.com"));
        addItem(new DummyItem("3", "BANK OF INDIA","Bank balance Check:\n9015135135\n\nMini statement:\n981055585\n\nCustomer care:\n1800220229\n\nWebsite:\nhttp://www.google.com"));
        addItem(new DummyItem("4", "AXIS BANK","Bank balance Check:\n9015483483\n\nMini statement:\n9015734734\n\nCustomer care:\n18004250018\n\nWebsite:\nhttp://www.google.com"));
        addItem(new DummyItem("5", "BANK OF BARODA","Bank balance Check:\n9015483483\n\nMini statement:\n9015734734\n\nCustomer care:\n18004250018\n\nWebsite:\nhttp://www.google.com"));
        addItem(new DummyItem("6", "HDFC BANK","Bank balance Check:\n9015483483\n\nMini statement:\n9015734734\n\nCustomer care:\n18004250018\n\nWebsite:\nhttp://www.google.com"));
        addItem(new DummyItem("7", "ICICI BANK","Bank balance Check:\n9015483483\n\nMini statement:\n9015734734\n\nCustomer care:\n18004250018\n\nWebsite:\nhttp://www.google.com"));
        addItem(new DummyItem("8", "SBI","Bank balance Check:\n9015483483\n\nMini statement:\n9015734734\n\nCustomer care:\n18004250018\n\nWebsite:\nhttp://www.google.com"));
        addItem(new DummyItem("9", "HSBC","Bank balance Check:\n9015483483\n\nMini statement:\n9015734734\n\nCustomer care:\n18004250018\n\nWebsite:\nhttp://www.google.com"));
        addItem(new DummyItem("10", "IDBI BANK","Bank balance Check:\n9015483483\n\nMini statement:\n9015734734\n\nCustomer care:\n18004250018\n\nWebsite:\nhttp://www.google.com"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
