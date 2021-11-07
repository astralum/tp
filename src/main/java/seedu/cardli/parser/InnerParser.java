package seedu.cardli.parser;


import seedu.cardli.commands.Command;
import seedu.cardli.commands.InvalidCommand;
import seedu.cardli.commands.deck.AddCardCommand;
import seedu.cardli.commands.deck.DeleteCardCommand;
import seedu.cardli.commands.deck.EditCardCommand;
import seedu.cardli.commands.deck.ExitDeckCommand;
import seedu.cardli.commands.deck.HelpInDeckCommand;
import seedu.cardli.commands.deck.MoveCardCommand;
import seedu.cardli.commands.deck.ViewCardsCommand;
import seedu.cardli.flashcard.Deck;
import seedu.cardli.flashcard.DeckManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InnerParser {

    private static final Logger logger = Logger.getLogger(InnerParser.class.getName());

    private Deck currDeck;

    private DeckManager deckManager;

    public InnerParser(Deck currDeck) {
        this.currDeck = currDeck;
    }

    public InnerParser() {
        this.currDeck = null;
    }

    public Command parseCommand(String input) {
        logger.setLevel(Level.WARNING);
        String commandType = Parser.getCommandType(input);
        logger.log(Level.INFO, "new user input detected");

        Command command;
        String arguments;

        switch (commandType) {
        case "add":
            arguments = Parser.getCommandArguments(commandType, input);
            command = new AddCardCommand(arguments, this.currDeck, this.deckManager);
            logger.log(Level.INFO, "add (card) command parsed and executed");
            break;
        case "edit": //edit /c <index> /s <side> /i <input>
            arguments = Parser.getCommandArguments(commandType, input);
            command = new EditCardCommand(arguments, this.currDeck, this.deckManager);
            logger.log(Level.INFO, "edit (card) command parsed and executed");
            break;
        case "delete":
            arguments = Parser.getCommandArguments(commandType, input);
            command = new DeleteCardCommand(arguments, this.currDeck);
            logger.log(Level.INFO, "delete (card) command parsed and executed");
            break;
        case "view":
            arguments = Parser.getCommandArguments(commandType, input);
            command = new ViewCardsCommand(this.currDeck, arguments);
            logger.log(Level.INFO, "view command parsed and executed");
            break;
        case "move": //move /c <index> /d <index
            arguments = Parser.getCommandArguments(commandType, input);
            command = new MoveCardCommand(arguments, this.currDeck, this.deckManager);
            logger.log(Level.INFO, "move command parsed and executed");
            break;
        case "help":
            arguments = Parser.getCommandArguments(commandType, input);
            command = new HelpInDeckCommand(arguments);
            logger.log(Level.INFO, "help command parsed and executed");
            break;
        case "exit":
            arguments = Parser.getCommandArguments(commandType, input);
            command = new ExitDeckCommand(arguments);
            logger.log(Level.INFO, "exit command parsed and executed");
            break;
        default:
            command = new InvalidCommand();
            logger.log(Level.INFO, "command was unrecognised and could not be parsed");
        }
        return command;
    }

    public void setCurrDeck(Deck currDeck) {
        this.currDeck = currDeck;
    }

    public void setDeckManager(DeckManager deckList) {
        this.deckManager = deckList;
    }
}
