package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputPrivacyValueAllowAll}: inputPrivacyValueAllowAll#184b35ce</li>
 * <li>{@link TLInputPrivacyValueAllowChatParticipants}: inputPrivacyValueAllowChatParticipants#840649cf</li>
 * <li>{@link TLInputPrivacyValueAllowContacts}: inputPrivacyValueAllowContacts#d09e07b</li>
 * <li>{@link TLInputPrivacyValueAllowUsers}: inputPrivacyValueAllowUsers#131cc67f</li>
 * <li>{@link TLInputPrivacyValueDisallowAll}: inputPrivacyValueDisallowAll#d66b66c9</li>
 * <li>{@link TLInputPrivacyValueDisallowChatParticipants}: inputPrivacyValueDisallowChatParticipants#e94f0f86</li>
 * <li>{@link TLInputPrivacyValueDisallowContacts}: inputPrivacyValueDisallowContacts#ba52007</li>
 * <li>{@link TLInputPrivacyValueDisallowUsers}: inputPrivacyValueDisallowUsers#90110467</li>
 * </ul>
 *
 */
public abstract class TLAbsInputPrivacyRule extends TLObject {
    public TLAbsInputPrivacyRule() {
    }
}
