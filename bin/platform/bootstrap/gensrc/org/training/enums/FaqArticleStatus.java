package org.training.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum FaqArticleStatus declared at extension training.
 */
@SuppressWarnings("PMD")
public enum FaqArticleStatus implements HybrisEnumValue
{
	/**
	 * Generated enum value for FaqArticleStatus.NEW declared at extension training.
	 */
	NEW("NEW"),
	/**
	 * Generated enum value for FaqArticleStatus.CHECK declared at extension training.
	 */
	CHECK("CHECK"),
	/**
	 * Generated enum value for FaqArticleStatus.APPROVED declared at extension training.
	 */
	APPROVED("APPROVED"),
	/**
	 * Generated enum value for FaqArticleStatus.REJECTED declared at extension training.
	 */
	REJECTED("REJECTED");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "FaqArticleStatus";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "FaqArticleStatus";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private FaqArticleStatus(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return SIMPLE_CLASSNAME;
	}
	
}
