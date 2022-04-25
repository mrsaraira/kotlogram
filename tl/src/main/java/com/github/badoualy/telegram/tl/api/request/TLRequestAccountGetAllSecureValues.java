package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLSecureValue;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestAccountGetAllSecureValues extends TLMethod<TLVector<TLSecureValue>> {
    public static final int CONSTRUCTOR_ID = 0xb288bc7d;

    private final String _constructor = "account.getAllSecureValues#b288bc7d";

    public TLRequestAccountGetAllSecureValues() {
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLVector<TLSecureValue> deserializeResponse(InputStream stream, TLContext context) throws IOException {
        return readTLVector(stream, context);
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
