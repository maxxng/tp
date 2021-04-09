package seedu.address.logic.parser;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.CountdownCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new CountdownCommand object
 */
public class CountdownCommandParser implements Parser<CountdownCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the CountdownCommand
     * and returns a CountdownCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public CountdownCommand parse(String args) throws ParseException {
        Index index = ParserUtil.parseIndex(args);
        return new CountdownCommand(index);
    }
}
