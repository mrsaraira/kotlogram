package com.github.badoualy.telegram.tl.api.stats;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsStatsGraph;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLMessageStats extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x8999f295;

    protected TLAbsStatsGraph viewsGraph;

    private final String _constructor = "stats.messageStats#8999f295";

    public TLMessageStats() {
    }

    public TLMessageStats(TLAbsStatsGraph viewsGraph) {
        this.viewsGraph = viewsGraph;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(viewsGraph, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        viewsGraph = readTLObject(stream, context, TLAbsStatsGraph.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += viewsGraph.computeSerializedSize();
        return size;
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

    public TLAbsStatsGraph getViewsGraph() {
        return viewsGraph;
    }

    public void setViewsGraph(TLAbsStatsGraph viewsGraph) {
        this.viewsGraph = viewsGraph;
    }
}
