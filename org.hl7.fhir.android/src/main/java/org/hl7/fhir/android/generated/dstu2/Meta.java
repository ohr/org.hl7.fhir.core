package org.hl7.fhir.android.generated.dstu2;

/*-
 * #%L
 * org.hl7.fhir.dstu2
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseMetaType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

/**
 * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.
 */
public class Meta extends Type implements IBaseMetaType {

    /**
     * The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted.
     */
    protected IdType versionId;

    /**
     * When the resource last changed - e.g. when the version changed.
     */
    protected InstantType lastUpdated;

    /**
     * A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].
     */
    protected List<UriType> profile;

    /**
     * Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.
     */
    protected List<Coding> security;

    /**
     * Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.
     */
    protected List<Coding> tag;

    private static final long serialVersionUID = 867134915L;

    /*
   * Constructor
   */
    public Meta() {
        super();
    }

    /**
     * @return {@link #versionId} (The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted.). This is the underlying object with id, value and extensions. The accessor "getVersionId" gives direct access to the value
     */
    public IdType getVersionIdElement() {
        if (this.versionId == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Meta.versionId");
            else if (Configuration.doAutoCreate())
                // bb
                this.versionId = new IdType();
        return this.versionId;
    }

    public boolean hasVersionIdElement() {
        return this.versionId != null && !this.versionId.isEmpty();
    }

    public boolean hasVersionId() {
        return this.versionId != null && !this.versionId.isEmpty();
    }

    /**
     * @param value {@link #versionId} (The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted.). This is the underlying object with id, value and extensions. The accessor "getVersionId" gives direct access to the value
     */
    public Meta setVersionIdElement(IdType value) {
        this.versionId = value;
        return this;
    }

    /**
     * @return The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted.
     */
    public String getVersionId() {
        return this.versionId == null ? null : this.versionId.getValue();
    }

    /**
     * @param value The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted.
     */
    public Meta setVersionId(String value) {
        if (Utilities.noString(value))
            this.versionId = null;
        else {
            if (this.versionId == null)
                this.versionId = new IdType();
            this.versionId.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #lastUpdated} (When the resource last changed - e.g. when the version changed.). This is the underlying object with id, value and extensions. The accessor "getLastUpdated" gives direct access to the value
     */
    public InstantType getLastUpdatedElement() {
        if (this.lastUpdated == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Meta.lastUpdated");
            else if (Configuration.doAutoCreate())
                // bb
                this.lastUpdated = new InstantType();
        return this.lastUpdated;
    }

    public boolean hasLastUpdatedElement() {
        return this.lastUpdated != null && !this.lastUpdated.isEmpty();
    }

    public boolean hasLastUpdated() {
        return this.lastUpdated != null && !this.lastUpdated.isEmpty();
    }

    /**
     * @param value {@link #lastUpdated} (When the resource last changed - e.g. when the version changed.). This is the underlying object with id, value and extensions. The accessor "getLastUpdated" gives direct access to the value
     */
    public Meta setLastUpdatedElement(InstantType value) {
        this.lastUpdated = value;
        return this;
    }

    /**
     * @return When the resource last changed - e.g. when the version changed.
     */
    public Date getLastUpdated() {
        return this.lastUpdated == null ? null : this.lastUpdated.getValue();
    }

    /**
     * @param value When the resource last changed - e.g. when the version changed.
     */
    public Meta setLastUpdated(Date value) {
        if (value == null)
            this.lastUpdated = null;
        else {
            if (this.lastUpdated == null)
                this.lastUpdated = new InstantType();
            this.lastUpdated.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #profile} (A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].)
     */
    public List<UriType> getProfile() {
        if (this.profile == null)
            this.profile = new ArrayList<UriType>();
        return this.profile;
    }

    public boolean hasProfile() {
        if (this.profile == null)
            return false;
        for (UriType item : this.profile) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #profile} (A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].)
     */
    // syntactic sugar
    public UriType addProfileElement() {
        // 2
        UriType t = new UriType();
        if (this.profile == null)
            this.profile = new ArrayList<UriType>();
        this.profile.add(t);
        return t;
    }

    /**
     * @param value {@link #profile} (A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].)
     */
    public Meta addProfile(String value) {
        // 1
        UriType t = new UriType();
        t.setValue(value);
        if (this.profile == null)
            this.profile = new ArrayList<UriType>();
        this.profile.add(t);
        return this;
    }

    /**
     * @param value {@link #profile} (A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].)
     */
    public boolean hasProfile(String value) {
        if (this.profile == null)
            return false;
        for (UriType v : this.profile) if (// uri
        v.equals(value))
            return true;
        return false;
    }

    /**
     * @return {@link #security} (Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.)
     */
    public List<Coding> getSecurity() {
        if (this.security == null)
            this.security = new ArrayList<Coding>();
        return this.security;
    }

    /**
     * Returns the first security label (if any) that has the given system and code, or returns
     * <code>null</code> if none
     */
    public Coding getSecurity(String theSystem, String theCode) {
        for (Coding next : getSecurity()) {
            if (ca.uhn.fhir.util.ObjectUtil.equals(next.getSystem(), theSystem) && ca.uhn.fhir.util.ObjectUtil.equals(next.getCode(), theCode)) {
                return next;
            }
        }
        return null;
    }

    public boolean hasSecurity() {
        if (this.security == null)
            return false;
        for (Coding item : this.security) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #security} (Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.)
     */
    // syntactic sugar
    public Coding addSecurity() {
        // 3
        Coding t = new Coding();
        if (this.security == null)
            this.security = new ArrayList<Coding>();
        this.security.add(t);
        return t;
    }

    // syntactic sugar
    public Meta addSecurity(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.security == null)
            this.security = new ArrayList<Coding>();
        this.security.add(t);
        return this;
    }

    /**
     * @return {@link #tag} (Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.)
     */
    public List<Coding> getTag() {
        if (this.tag == null)
            this.tag = new ArrayList<Coding>();
        return this.tag;
    }

    /**
     * Returns the first tag (if any) that has the given system and code, or returns
     * <code>null</code> if none
     */
    public Coding getTag(String theSystem, String theCode) {
        for (Coding next : getTag()) {
            if (ca.uhn.fhir.util.ObjectUtil.equals(next.getSystem(), theSystem) && ca.uhn.fhir.util.ObjectUtil.equals(next.getCode(), theCode)) {
                return next;
            }
        }
        return null;
    }

    public boolean hasTag() {
        if (this.tag == null)
            return false;
        for (Coding item : this.tag) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #tag} (Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.)
     */
    // syntactic sugar
    public Coding addTag() {
        // 3
        Coding t = new Coding();
        if (this.tag == null)
            this.tag = new ArrayList<Coding>();
        this.tag.add(t);
        return t;
    }

    // syntactic sugar
    public Meta addTag(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.tag == null)
            this.tag = new ArrayList<Coding>();
        this.tag.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("versionId", "id", "The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted.", 0, java.lang.Integer.MAX_VALUE, versionId));
        childrenList.add(new Property("lastUpdated", "instant", "When the resource last changed - e.g. when the version changed.", 0, java.lang.Integer.MAX_VALUE, lastUpdated));
        childrenList.add(new Property("profile", "uri", "A list of profiles [[[StructureDefinition]]]s that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]].", 0, java.lang.Integer.MAX_VALUE, profile));
        childrenList.add(new Property("security", "Coding", "Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure.", 0, java.lang.Integer.MAX_VALUE, security));
        childrenList.add(new Property("tag", "Coding", "Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource.", 0, java.lang.Integer.MAX_VALUE, tag));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("versionId"))
            // IdType
            this.versionId = castToId(value);
        else if (name.equals("lastUpdated"))
            // InstantType
            this.lastUpdated = castToInstant(value);
        else if (name.equals("profile"))
            this.getProfile().add(castToUri(value));
        else if (name.equals("security"))
            this.getSecurity().add(castToCoding(value));
        else if (name.equals("tag"))
            this.getTag().add(castToCoding(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("versionId")) {
            throw new FHIRException("Cannot call addChild on a primitive type Meta.versionId");
        } else if (name.equals("lastUpdated")) {
            throw new FHIRException("Cannot call addChild on a primitive type Meta.lastUpdated");
        } else if (name.equals("profile")) {
            throw new FHIRException("Cannot call addChild on a primitive type Meta.profile");
        } else if (name.equals("security")) {
            return addSecurity();
        } else if (name.equals("tag")) {
            return addTag();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Meta";
    }

    public Meta copy() {
        Meta dst = new Meta();
        copyValues(dst);
        dst.versionId = versionId == null ? null : versionId.copy();
        dst.lastUpdated = lastUpdated == null ? null : lastUpdated.copy();
        if (profile != null) {
            dst.profile = new ArrayList<UriType>();
            for (UriType i : profile) dst.profile.add(i.copy());
        }
        ;
        if (security != null) {
            dst.security = new ArrayList<Coding>();
            for (Coding i : security) dst.security.add(i.copy());
        }
        ;
        if (tag != null) {
            dst.tag = new ArrayList<Coding>();
            for (Coding i : tag) dst.tag.add(i.copy());
        }
        ;
        return dst;
    }

    protected Meta typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Meta))
            return false;
        Meta o = (Meta) other;
        return compareDeep(versionId, o.versionId, true) && compareDeep(lastUpdated, o.lastUpdated, true) && compareDeep(profile, o.profile, true) && compareDeep(security, o.security, true) && compareDeep(tag, o.tag, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Meta))
            return false;
        Meta o = (Meta) other;
        return compareValues(versionId, o.versionId, true) && compareValues(lastUpdated, o.lastUpdated, true) && compareValues(profile, o.profile, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (versionId == null || versionId.isEmpty()) && (lastUpdated == null || lastUpdated.isEmpty()) && (profile == null || profile.isEmpty()) && (security == null || security.isEmpty()) && (tag == null || tag.isEmpty());
    }
}
