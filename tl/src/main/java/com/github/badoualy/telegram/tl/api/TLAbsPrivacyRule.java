package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLPrivacyValueAllowAll}: privacyValueAllowAll#65427b82</li>
 * <li>{@link TLPrivacyValueAllowChatParticipants}: privacyValueAllowChatParticipants#6b134e8e</li>
 * <li>{@link TLPrivacyValueAllowContacts}: privacyValueAllowContacts#fffe1bac</li>
 * <li>{@link TLPrivacyValueAllowUsers}: privacyValueAllowUsers#b8905fb2</li>
 * <li>{@link TLPrivacyValueDisallowAll}: privacyValueDisallowAll#8b73e763</li>
 * <li>{@link TLPrivacyValueDisallowChatParticipants}: privacyValueDisallowChatParticipants#41c87565</li>
 * <li>{@link TLPrivacyValueDisallowContacts}: privacyValueDisallowContacts#f888fa1a</li>
 * <li>{@link TLPrivacyValueDisallowUsers}: privacyValueDisallowUsers#e4621141</li>
 * </ul>
 *
 */
public abstract class TLAbsPrivacyRule extends TLObject {
    public TLAbsPrivacyRule() {
    }
}
