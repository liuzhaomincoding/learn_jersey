package com.github.astutesparrow.jersey.storage;

import com.github.astutesparrow.jersey.domain.Address;
import com.github.astutesparrow.jersey.domain.Contact;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: 智深
 * @since: 2013-05-11
 */
public class ContactStore {
    private static Map<String,Contact> store;
    private static ContactStore instance = null;

    private ContactStore() {
        store = new HashMap<String,Contact>();
        initOneContact();
    }

    public static Map<String,Contact> getStore() {
        if(instance==null) {
            instance = new ContactStore();
        }
        return store;
    }

    private static void initOneContact() {
        Address[] addrs = {
                new Address("Shanghai", "Long Hua Street"),
                new Address("Shanghai", "Dong Quan Street")
        };
        Contact cHuang = new Contact("huangyim", "Huang Yi Ming", Arrays.asList(addrs));
        store.put(cHuang.getId(), cHuang);
    }
}
