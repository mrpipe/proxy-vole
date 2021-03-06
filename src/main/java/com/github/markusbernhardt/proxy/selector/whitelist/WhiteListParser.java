package com.github.markusbernhardt.proxy.selector.whitelist;

import java.util.List;

import com.github.markusbernhardt.proxy.util.UriFilter;

/*****************************************************************************
 * Interface for an white list parser. This will take an white list string and
 * parse it into a list of UriFilter rules.
 *
 * @author Franz Bartlechner, Copyright 2019
 * @author Markus Bernhardt, Copyright 2016
 * @author Bernd Rosstauscher, Copyright 2009
 ****************************************************************************/

public interface WhiteListParser {

	/*************************************************************************
	 * Parses a list of host name and IP filters into UriFilter objects.
	 * 
	 * @param whiteList
	 *            the string to parse.
	 * @return a list of UriFilters
	 ************************************************************************/

	List<UriFilter> parseWhiteList(String whiteList);
}