package Practice24.Task3;

class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("Создан текстовый документ");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("Открыт текстовый документ");
        return new TextDocument();
    }
}
