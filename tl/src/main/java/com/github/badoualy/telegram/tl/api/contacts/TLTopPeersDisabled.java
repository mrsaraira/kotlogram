package com.github.badoualy.telegram.tl.api.contacts;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLTopPeersDisabled extends TLAbsTopPeers {
    public static final int CONSTRUCTOR_ID = 0xb52c939d;

    private final String _constructor = "contacts.topPeersDisabled#b52c939d";

    public TLTopPeersDisabled() {
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }
}
