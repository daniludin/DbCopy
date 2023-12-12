package dbcopy.model;

public interface DatabaseStructureReader {
	StringBuffer readDbStructure(String url, String username, String password) throws CustomSQLException;
}
