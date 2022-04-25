package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;
import java.lang.String;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLPageListOrderedItemBlocks}: pageListOrderedItemBlocks#98dd8936</li>
 * <li>{@link TLPageListOrderedItemText}: pageListOrderedItemText#5e068047</li>
 * </ul>
 *
 */
public abstract class TLAbsPageListOrderedItem extends TLObject {
    protected String num;

    public TLAbsPageListOrderedItem() {
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
