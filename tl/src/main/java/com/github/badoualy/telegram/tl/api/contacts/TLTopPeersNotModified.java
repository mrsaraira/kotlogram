package com.github.badoualy.telegram.tl.api.contacts;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLTopPeersNotModified extends TLAbsTopPeers {
    public static final int CONSTRUCTOR_ID = 0xde266ef5;

    private final String _constructor = "contacts.topPeersNotModified#de266ef5";

    public TLTopPeersNotModified() {
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
