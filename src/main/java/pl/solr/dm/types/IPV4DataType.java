package pl.solr.dm.types;

import pl.solr.dm.DataType;

/**
 * Naive Random IP Address generator
 * @author sarwar
 *
 */
public class IPV4DataType extends DataType<String> {

	@Override
	public String getNewValue() {
		return GENERATOR.getNumberUpTo(255)+"."+
			   GENERATOR.getNumberUpTo(255)+"."+
			   GENERATOR.getNumberUpTo(255)+"."+
			   GENERATOR.getNumberUpTo(255);
	}

}
