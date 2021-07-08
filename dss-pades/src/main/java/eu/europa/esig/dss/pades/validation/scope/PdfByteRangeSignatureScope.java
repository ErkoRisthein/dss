/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 * 
 * This file is part of the "DSS - Digital Signature Services" project.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.esig.dss.pades.validation.scope;

import eu.europa.esig.dss.model.Digest;
import eu.europa.esig.dss.pades.validation.ByteRange;
import eu.europa.esig.dss.validation.scope.PartialSignatureScope;

/**
 * The signature scope represents a signed PDF byte range
 *
 */
public class PdfByteRangeSignatureScope extends PartialSignatureScope {

	private static final long serialVersionUID = -5812599751054145819L;

	/** The covered byte range */
	private final ByteRange byteRange;

	/**
	 * Default constructor
	 *
	 * @param name {@link String} document name
	 * @param byteRange {@link ByteRange}
	 * @param digest {@link Digest}
	 */
	public PdfByteRangeSignatureScope(final String name, final ByteRange byteRange, final Digest digest) {
		super(name, digest);
		this.byteRange = byteRange;
	}

	@Override
	public String getDescription() {
		return "The document ByteRange : " + byteRange;
	}
}
