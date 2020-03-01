package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

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
/**
 * This resource provides processing status, errors and notes from the processing of a resource.
 */
public class ProcessResponse extends DomainResource {

    /**
     * The Response business identifier.
     */
    protected List<Identifier> identifier;

    /**
     * Original request resource reference.
     */
    protected Reference request;

    /**
     * The actual object that is the target of the reference (Original request resource reference.)
     */
    protected Resource requestTarget;

    /**
     * Transaction status: error, complete, held.
     */
    protected Coding outcome;

    /**
     * A description of the status of the adjudication or processing.
     */
    protected StringType disposition;

    /**
     * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
     */
    protected Coding ruleset;

    /**
     * The style (standard) and version of the original material which was converted into this resource.
     */
    protected Coding originalRuleset;

    /**
     * The date when the enclosed suite of services were performed or completed.
     */
    protected DateTimeType created;

    /**
     * The organization who produced this adjudicated response.
     */
    protected Reference organization;

    /**
     * The actual object that is the target of the reference (The organization who produced this adjudicated response.)
     */
    protected Organization organizationTarget;

    /**
     * The practitioner who is responsible for the services rendered to the patient.
     */
    protected Reference requestProvider;

    /**
     * The actual object that is the target of the reference (The practitioner who is responsible for the services rendered to the patient.)
     */
    protected Practitioner requestProviderTarget;

    /**
     * The organization which is responsible for the services rendered to the patient.
     */
    protected Reference requestOrganization;

    /**
     * The actual object that is the target of the reference (The organization which is responsible for the services rendered to the patient.)
     */
    protected Organization requestOrganizationTarget;

    /**
     * The form to be used for printing the content.
     */
    protected Coding form;

    /**
     * Suite of processing note or additional requirements is the processing has been held.
     */
    protected List<ProcessResponseNotesComponent> notes;

    /**
     * Processing errors.
     */
    protected List<Coding> error;

    private static final long serialVersionUID = -1668062545L;

    /*
   * Constructor
   */
    public ProcessResponse() {
        super();
    }

    /**
     * @return {@link #identifier} (The Response business identifier.)
     */
    public List<Identifier> getIdentifier() {
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        if (this.identifier == null)
            return false;
        for (Identifier item : this.identifier) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #identifier} (The Response business identifier.)
     */
    // syntactic sugar
    public Identifier addIdentifier() {
        // 3
        Identifier t = new Identifier();
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return t;
    }

    // syntactic sugar
    public ProcessResponse addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #request} (Original request resource reference.)
     */
    public Reference getRequest() {
        if (this.request == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.request");
            else if (Configuration.doAutoCreate())
                // cc
                this.request = new Reference();
        return this.request;
    }

    public boolean hasRequest() {
        return this.request != null && !this.request.isEmpty();
    }

    /**
     * @param value {@link #request} (Original request resource reference.)
     */
    public ProcessResponse setRequest(Reference value) {
        this.request = value;
        return this;
    }

    /**
     * @return {@link #request} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Original request resource reference.)
     */
    public Resource getRequestTarget() {
        return this.requestTarget;
    }

    /**
     * @param value {@link #request} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Original request resource reference.)
     */
    public ProcessResponse setRequestTarget(Resource value) {
        this.requestTarget = value;
        return this;
    }

    /**
     * @return {@link #outcome} (Transaction status: error, complete, held.)
     */
    public Coding getOutcome() {
        if (this.outcome == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.outcome");
            else if (Configuration.doAutoCreate())
                // cc
                this.outcome = new Coding();
        return this.outcome;
    }

    public boolean hasOutcome() {
        return this.outcome != null && !this.outcome.isEmpty();
    }

    /**
     * @param value {@link #outcome} (Transaction status: error, complete, held.)
     */
    public ProcessResponse setOutcome(Coding value) {
        this.outcome = value;
        return this;
    }

    /**
     * @return {@link #disposition} (A description of the status of the adjudication or processing.). This is the underlying object with id, value and extensions. The accessor "getDisposition" gives direct access to the value
     */
    public StringType getDispositionElement() {
        if (this.disposition == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.disposition");
            else if (Configuration.doAutoCreate())
                // bb
                this.disposition = new StringType();
        return this.disposition;
    }

    public boolean hasDispositionElement() {
        return this.disposition != null && !this.disposition.isEmpty();
    }

    public boolean hasDisposition() {
        return this.disposition != null && !this.disposition.isEmpty();
    }

    /**
     * @param value {@link #disposition} (A description of the status of the adjudication or processing.). This is the underlying object with id, value and extensions. The accessor "getDisposition" gives direct access to the value
     */
    public ProcessResponse setDispositionElement(StringType value) {
        this.disposition = value;
        return this;
    }

    /**
     * @return A description of the status of the adjudication or processing.
     */
    public String getDisposition() {
        return this.disposition == null ? null : this.disposition.getValue();
    }

    /**
     * @param value A description of the status of the adjudication or processing.
     */
    public ProcessResponse setDisposition(String value) {
        if (Utilities.noString(value))
            this.disposition = null;
        else {
            if (this.disposition == null)
                this.disposition = new StringType();
            this.disposition.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public Coding getRuleset() {
        if (this.ruleset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.ruleset");
            else if (Configuration.doAutoCreate())
                // cc
                this.ruleset = new Coding();
        return this.ruleset;
    }

    public boolean hasRuleset() {
        return this.ruleset != null && !this.ruleset.isEmpty();
    }

    /**
     * @param value {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public ProcessResponse setRuleset(Coding value) {
        this.ruleset = value;
        return this;
    }

    /**
     * @return {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public Coding getOriginalRuleset() {
        if (this.originalRuleset == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.originalRuleset");
            else if (Configuration.doAutoCreate())
                // cc
                this.originalRuleset = new Coding();
        return this.originalRuleset;
    }

    public boolean hasOriginalRuleset() {
        return this.originalRuleset != null && !this.originalRuleset.isEmpty();
    }

    /**
     * @param value {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public ProcessResponse setOriginalRuleset(Coding value) {
        this.originalRuleset = value;
        return this;
    }

    /**
     * @return {@link #created} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() {
        if (this.created == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.created");
            else if (Configuration.doAutoCreate())
                // bb
                this.created = new DateTimeType();
        return this.created;
    }

    public boolean hasCreatedElement() {
        return this.created != null && !this.created.isEmpty();
    }

    public boolean hasCreated() {
        return this.created != null && !this.created.isEmpty();
    }

    /**
     * @param value {@link #created} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public ProcessResponse setCreatedElement(DateTimeType value) {
        this.created = value;
        return this;
    }

    /**
     * @return The date when the enclosed suite of services were performed or completed.
     */
    public Date getCreated() {
        return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value The date when the enclosed suite of services were performed or completed.
     */
    public ProcessResponse setCreated(Date value) {
        if (value == null)
            this.created = null;
        else {
            if (this.created == null)
                this.created = new DateTimeType();
            this.created.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #organization} (The organization who produced this adjudicated response.)
     */
    public Reference getOrganization() {
        if (this.organization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.organization");
            else if (Configuration.doAutoCreate())
                // cc
                this.organization = new Reference();
        return this.organization;
    }

    public boolean hasOrganization() {
        return this.organization != null && !this.organization.isEmpty();
    }

    /**
     * @param value {@link #organization} (The organization who produced this adjudicated response.)
     */
    public ProcessResponse setOrganization(Reference value) {
        this.organization = value;
        return this;
    }

    /**
     * @return {@link #organization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization who produced this adjudicated response.)
     */
    public Organization getOrganizationTarget() {
        if (this.organizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.organization");
            else if (Configuration.doAutoCreate())
                // aa
                this.organizationTarget = new Organization();
        return this.organizationTarget;
    }

    /**
     * @param value {@link #organization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization who produced this adjudicated response.)
     */
    public ProcessResponse setOrganizationTarget(Organization value) {
        this.organizationTarget = value;
        return this;
    }

    /**
     * @return {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Reference getRequestProvider() {
        if (this.requestProvider == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.requestProvider");
            else if (Configuration.doAutoCreate())
                // cc
                this.requestProvider = new Reference();
        return this.requestProvider;
    }

    public boolean hasRequestProvider() {
        return this.requestProvider != null && !this.requestProvider.isEmpty();
    }

    /**
     * @param value {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public ProcessResponse setRequestProvider(Reference value) {
        this.requestProvider = value;
        return this;
    }

    /**
     * @return {@link #requestProvider} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Practitioner getRequestProviderTarget() {
        if (this.requestProviderTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.requestProvider");
            else if (Configuration.doAutoCreate())
                // aa
                this.requestProviderTarget = new Practitioner();
        return this.requestProviderTarget;
    }

    /**
     * @param value {@link #requestProvider} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The practitioner who is responsible for the services rendered to the patient.)
     */
    public ProcessResponse setRequestProviderTarget(Practitioner value) {
        this.requestProviderTarget = value;
        return this;
    }

    /**
     * @return {@link #requestOrganization} (The organization which is responsible for the services rendered to the patient.)
     */
    public Reference getRequestOrganization() {
        if (this.requestOrganization == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.requestOrganization");
            else if (Configuration.doAutoCreate())
                // cc
                this.requestOrganization = new Reference();
        return this.requestOrganization;
    }

    public boolean hasRequestOrganization() {
        return this.requestOrganization != null && !this.requestOrganization.isEmpty();
    }

    /**
     * @param value {@link #requestOrganization} (The organization which is responsible for the services rendered to the patient.)
     */
    public ProcessResponse setRequestOrganization(Reference value) {
        this.requestOrganization = value;
        return this;
    }

    /**
     * @return {@link #requestOrganization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the services rendered to the patient.)
     */
    public Organization getRequestOrganizationTarget() {
        if (this.requestOrganizationTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.requestOrganization");
            else if (Configuration.doAutoCreate())
                // aa
                this.requestOrganizationTarget = new Organization();
        return this.requestOrganizationTarget;
    }

    /**
     * @param value {@link #requestOrganization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the services rendered to the patient.)
     */
    public ProcessResponse setRequestOrganizationTarget(Organization value) {
        this.requestOrganizationTarget = value;
        return this;
    }

    /**
     * @return {@link #form} (The form to be used for printing the content.)
     */
    public Coding getForm() {
        if (this.form == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create ProcessResponse.form");
            else if (Configuration.doAutoCreate())
                // cc
                this.form = new Coding();
        return this.form;
    }

    public boolean hasForm() {
        return this.form != null && !this.form.isEmpty();
    }

    /**
     * @param value {@link #form} (The form to be used for printing the content.)
     */
    public ProcessResponse setForm(Coding value) {
        this.form = value;
        return this;
    }

    /**
     * @return {@link #notes} (Suite of processing note or additional requirements is the processing has been held.)
     */
    public List<ProcessResponseNotesComponent> getNotes() {
        if (this.notes == null)
            this.notes = new ArrayList<ProcessResponseNotesComponent>();
        return this.notes;
    }

    public boolean hasNotes() {
        if (this.notes == null)
            return false;
        for (ProcessResponseNotesComponent item : this.notes) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #notes} (Suite of processing note or additional requirements is the processing has been held.)
     */
    // syntactic sugar
    public ProcessResponseNotesComponent addNotes() {
        // 3
        ProcessResponseNotesComponent t = new ProcessResponseNotesComponent();
        if (this.notes == null)
            this.notes = new ArrayList<ProcessResponseNotesComponent>();
        this.notes.add(t);
        return t;
    }

    // syntactic sugar
    public ProcessResponse addNotes(ProcessResponseNotesComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.notes == null)
            this.notes = new ArrayList<ProcessResponseNotesComponent>();
        this.notes.add(t);
        return this;
    }

    /**
     * @return {@link #error} (Processing errors.)
     */
    public List<Coding> getError() {
        if (this.error == null)
            this.error = new ArrayList<Coding>();
        return this.error;
    }

    public boolean hasError() {
        if (this.error == null)
            return false;
        for (Coding item : this.error) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #error} (Processing errors.)
     */
    // syntactic sugar
    public Coding addError() {
        // 3
        Coding t = new Coding();
        if (this.error == null)
            this.error = new ArrayList<Coding>();
        this.error.add(t);
        return t;
    }

    // syntactic sugar
    public ProcessResponse addError(Coding t) {
        // 3
        if (t == null)
            return this;
        if (this.error == null)
            this.error = new ArrayList<Coding>();
        this.error.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "The Response business identifier.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("request", "Reference(Any)", "Original request resource reference.", 0, java.lang.Integer.MAX_VALUE, request));
        childrenList.add(new Property("outcome", "Coding", "Transaction status: error, complete, held.", 0, java.lang.Integer.MAX_VALUE, outcome));
        childrenList.add(new Property("disposition", "string", "A description of the status of the adjudication or processing.", 0, java.lang.Integer.MAX_VALUE, disposition));
        childrenList.add(new Property("ruleset", "Coding", "The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.", 0, java.lang.Integer.MAX_VALUE, ruleset));
        childrenList.add(new Property("originalRuleset", "Coding", "The style (standard) and version of the original material which was converted into this resource.", 0, java.lang.Integer.MAX_VALUE, originalRuleset));
        childrenList.add(new Property("created", "dateTime", "The date when the enclosed suite of services were performed or completed.", 0, java.lang.Integer.MAX_VALUE, created));
        childrenList.add(new Property("organization", "Reference(Organization)", "The organization who produced this adjudicated response.", 0, java.lang.Integer.MAX_VALUE, organization));
        childrenList.add(new Property("requestProvider", "Reference(Practitioner)", "The practitioner who is responsible for the services rendered to the patient.", 0, java.lang.Integer.MAX_VALUE, requestProvider));
        childrenList.add(new Property("requestOrganization", "Reference(Organization)", "The organization which is responsible for the services rendered to the patient.", 0, java.lang.Integer.MAX_VALUE, requestOrganization));
        childrenList.add(new Property("form", "Coding", "The form to be used for printing the content.", 0, java.lang.Integer.MAX_VALUE, form));
        childrenList.add(new Property("notes", "", "Suite of processing note or additional requirements is the processing has been held.", 0, java.lang.Integer.MAX_VALUE, notes));
        childrenList.add(new Property("error", "Coding", "Processing errors.", 0, java.lang.Integer.MAX_VALUE, error));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("request"))
            // Reference
            this.request = castToReference(value);
        else if (name.equals("outcome"))
            // Coding
            this.outcome = castToCoding(value);
        else if (name.equals("disposition"))
            // StringType
            this.disposition = castToString(value);
        else if (name.equals("ruleset"))
            // Coding
            this.ruleset = castToCoding(value);
        else if (name.equals("originalRuleset"))
            // Coding
            this.originalRuleset = castToCoding(value);
        else if (name.equals("created"))
            // DateTimeType
            this.created = castToDateTime(value);
        else if (name.equals("organization"))
            // Reference
            this.organization = castToReference(value);
        else if (name.equals("requestProvider"))
            // Reference
            this.requestProvider = castToReference(value);
        else if (name.equals("requestOrganization"))
            // Reference
            this.requestOrganization = castToReference(value);
        else if (name.equals("form"))
            // Coding
            this.form = castToCoding(value);
        else if (name.equals("notes"))
            this.getNotes().add((ProcessResponseNotesComponent) value);
        else if (name.equals("error"))
            this.getError().add(castToCoding(value));
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("request")) {
            this.request = new Reference();
            return this.request;
        } else if (name.equals("outcome")) {
            this.outcome = new Coding();
            return this.outcome;
        } else if (name.equals("disposition")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcessResponse.disposition");
        } else if (name.equals("ruleset")) {
            this.ruleset = new Coding();
            return this.ruleset;
        } else if (name.equals("originalRuleset")) {
            this.originalRuleset = new Coding();
            return this.originalRuleset;
        } else if (name.equals("created")) {
            throw new FHIRException("Cannot call addChild on a primitive type ProcessResponse.created");
        } else if (name.equals("organization")) {
            this.organization = new Reference();
            return this.organization;
        } else if (name.equals("requestProvider")) {
            this.requestProvider = new Reference();
            return this.requestProvider;
        } else if (name.equals("requestOrganization")) {
            this.requestOrganization = new Reference();
            return this.requestOrganization;
        } else if (name.equals("form")) {
            this.form = new Coding();
            return this.form;
        } else if (name.equals("notes")) {
            return addNotes();
        } else if (name.equals("error")) {
            return addError();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "ProcessResponse";
    }

    public ProcessResponse copy() {
        ProcessResponse dst = new ProcessResponse();
        copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.request = request == null ? null : request.copy();
        dst.outcome = outcome == null ? null : outcome.copy();
        dst.disposition = disposition == null ? null : disposition.copy();
        dst.ruleset = ruleset == null ? null : ruleset.copy();
        dst.originalRuleset = originalRuleset == null ? null : originalRuleset.copy();
        dst.created = created == null ? null : created.copy();
        dst.organization = organization == null ? null : organization.copy();
        dst.requestProvider = requestProvider == null ? null : requestProvider.copy();
        dst.requestOrganization = requestOrganization == null ? null : requestOrganization.copy();
        dst.form = form == null ? null : form.copy();
        if (notes != null) {
            dst.notes = new ArrayList<ProcessResponseNotesComponent>();
            for (ProcessResponseNotesComponent i : notes) dst.notes.add(i.copy());
        }
        ;
        if (error != null) {
            dst.error = new ArrayList<Coding>();
            for (Coding i : error) dst.error.add(i.copy());
        }
        ;
        return dst;
    }

    protected ProcessResponse typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof ProcessResponse))
            return false;
        ProcessResponse o = (ProcessResponse) other;
        return compareDeep(identifier, o.identifier, true) && compareDeep(request, o.request, true) && compareDeep(outcome, o.outcome, true) && compareDeep(disposition, o.disposition, true) && compareDeep(ruleset, o.ruleset, true) && compareDeep(originalRuleset, o.originalRuleset, true) && compareDeep(created, o.created, true) && compareDeep(organization, o.organization, true) && compareDeep(requestProvider, o.requestProvider, true) && compareDeep(requestOrganization, o.requestOrganization, true) && compareDeep(form, o.form, true) && compareDeep(notes, o.notes, true) && compareDeep(error, o.error, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof ProcessResponse))
            return false;
        ProcessResponse o = (ProcessResponse) other;
        return compareValues(disposition, o.disposition, true) && compareValues(created, o.created, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (request == null || request.isEmpty()) && (outcome == null || outcome.isEmpty()) && (disposition == null || disposition.isEmpty()) && (ruleset == null || ruleset.isEmpty()) && (originalRuleset == null || originalRuleset.isEmpty()) && (created == null || created.isEmpty()) && (organization == null || organization.isEmpty()) && (requestProvider == null || requestProvider.isEmpty()) && (requestOrganization == null || requestOrganization.isEmpty()) && (form == null || form.isEmpty()) && (notes == null || notes.isEmpty()) && (error == null || error.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.ProcessResponse;
    }

    public static final String SP_IDENTIFIER = "identifier";

    public static final String SP_REQUEST = "request";

    public static final String SP_ORGANIZATION = "organization";

    public static final String SP_REQUESTPROVIDER = "requestprovider";

    public static final String SP_REQUESTORGANIZATION = "requestorganization";
}
