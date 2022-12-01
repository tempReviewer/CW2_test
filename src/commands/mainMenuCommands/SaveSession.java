package commands.mainMenuCommands;

import commands.abstracts.Command;
import game.storage.SaveStorage;
import game.runners.SessionRunner;

public class SaveSession implements Command {
    private SessionRunner sessionRunner;

    public SaveSession(SessionRunner sessionRunner) {
        this.sessionRunner = sessionRunner;
    }

    @Override
    public void execute() {
        //не знаю, стоит ли создавать поле SaveStorage и передавать его в конструкторе,
        // так что пока сделал так
        new SaveStorage().saveSession(sessionRunner.getSessionState());
    }

    @Override
    public String getName() {
        return "Сохранить игру";
    }


}
