package com.example.dictionary000.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DictionaryDBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "dictionary.db";
    private static final int DATABASE_VERSION = 2;

    public static final String TABLE_DICT = "dictionary";
    public static final String TABLE_TOPIC = "topic";
    public static final String TABLE_USER = "user";
    public  static  final  String TABLE_Gammar="grammar";

    public DictionaryDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Tạo bảng
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_TOPIC + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL)");

        db.execSQL("CREATE TABLE " + TABLE_DICT + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "word TEXT NOT NULL," +
                "meaning TEXT NOT NULL," +
                "word_type TEXT," +
                "topic_id INTEGER," +
                "FOREIGN KEY(topic_id) REFERENCES " + TABLE_TOPIC + "(id))");

        db.execSQL("CREATE TABLE " + TABLE_USER + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL,"+
                "email TEXT NOT NULL UNIQUE," +
                "password TEXT NOT NULL," +
                "role TEXT DEFAULT 'user')");
        db.execSQL("CREATE TABLE " + TABLE_Gammar + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "title Text Not null,"+
                "structure Text Not null,"+
                "description Text Not null,"+
                "example Text" +


        ")");
        db.execSQL("INSERT INTO " + TABLE_USER + " (name, email, password, role) VALUES " +
                "('Nguyen Van A', 'a@gmail.com', '123456', 'user')");

        db.execSQL("INSERT INTO " + TABLE_USER + " (name, email, password, role) VALUES " +
                "('Tran Thi B', 'b@gmail.com', '654321', 'user')");

        db.execSQL("INSERT INTO " + TABLE_USER + " (name, email, password, role) VALUES " +
                "('Admin', 'admin@gmail.com', 'admin123', 'admin')");
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Animals')");
        // Chủ đề 1: Động vật
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cat', 'Con mèo', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dog', 'Con chó', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Elephant', 'Con voi', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tiger', 'Con hổ', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lion', 'Con sư tử', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Monkey', 'Con khỉ', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rabbit', 'Con thỏ', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bear', 'Con gấu', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fox', 'Con cáo', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wolf', 'Con sói', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Deer', 'Con nai', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Horse', 'Con ngựa', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cow', 'Con bò', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pig', 'Con heo', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sheep', 'Con cừu', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Goat', 'Con dê', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chicken', 'Con gà', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Duck', 'Con vịt', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Swan', 'Con thiên nga', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Owl', 'Con cú', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Eagle', 'Con đại bàng', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Parrot', 'Con vẹt', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Frog', 'Con ếch', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Snake', 'Con rắn', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Crocodile', 'Con cá sấu', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shark', 'Con cá mập', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Whale', 'Con cá voi', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dolphin', 'Con cá heo', 'Noun', 1)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Penguin', 'Con chim cánh cụt', 'Noun', 1)");



        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Foods')");
        // Chủ đề 2: Food
        // Chủ đề 2: Foods (Món ăn)
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pizza', 'Bánh pizza', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Burger', 'Bánh burger', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pasta', 'Mỳ ống', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sushi', 'Sushi', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Steak', 'Bít tết', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fried chicken', 'Gà rán', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hot dog', 'Xúc xích kẹp bánh mì', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sandwich', 'Bánh mì kẹp', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Taco', 'Taco', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ramen', 'Mì ramen', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dumpling', 'Há cảo', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Curry', 'Cà ri', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Salad', 'Salad', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Soup', 'Súp', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bacon', 'Thịt xông khói', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Omelette', 'Trứng ốp la', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lasagna', 'Món Lasagna', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Paella', 'Món Paella', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sandwich club', 'Bánh mì club', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Grilled chicken', 'Gà nướng', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fish and chips', 'Cá chiên và khoai tây', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Meatball', 'Xíu mại', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fried rice', 'Cơm chiên', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Spaghetti', 'Mì Ý', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chicken wings', 'Cánh gà', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Spring roll', 'Chả giò', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sausage', 'Xúc xích', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pancake', 'Bánh kếp', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Burger steak', 'Bít tết burger', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hot pot', 'Lẩu', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Roast beef', 'Thịt bò quay', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Mashed potatoes', 'Khoai tây nghiền', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Grilled salmon', 'Cá hồi nướng', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Seafood platter', 'Đĩa hải sản tổng hợp', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tuna sandwich', 'Bánh mì cá ngừ', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Beef stew', 'Thịt bò hầm', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shrimp fried rice', 'Cơm chiên tôm', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('BBQ ribs', 'Sườn nướng BBQ', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chicken curry', 'Cà ri gà', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Grilled pork', 'Thịt heo nướng', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Beef noodle soup (Pho)', 'Phở bò', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chicken noodle soup', 'Súp mì gà', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Egg fried rice', 'Cơm chiên trứng', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tofu stir-fry', 'Đậu hũ xào', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Vegetable soup', 'Súp rau củ', 'Noun', 2)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ice cream', 'Kem', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cake', 'Bánh ngọt', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chocolate', 'Sô-cô-la', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pudding', 'Bánh pudding', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Donut', 'Bánh vòng', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cupcake', 'Bánh cupcake', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pie', 'Bánh pie', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Brownie', 'Bánh brownie', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Muffin', 'Bánh muffin', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Jelly', 'Thạch', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cheesecake', 'Bánh phô mai', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tiramisu', 'Bánh tiramisu', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Macaron', 'Bánh macaron', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Waffle', 'Bánh quế', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Custard', 'Bánh trứng nướng', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sorbet', 'Kem trái cây', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Crepe', 'Bánh crepe', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pancake syrup', 'Siro bánh kếp', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fruit salad', 'Salad trái cây', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Banana split', 'Kem chuối', 'Noun', 3)");







        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Family')");
        // Chủ đề 3: Gia đình
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Father', 'Bố', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Mother', 'Mẹ', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Brother', 'Anh/Em trai', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sister', 'Chị/Em gái', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Grandfather', 'Ông', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Grandmother', 'Bà', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Uncle', 'Chú/Bác', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Aunt', 'Cô/Bác', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cousin', 'Anh/Chị/Em họ', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Son', 'Con trai', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Daughter', 'Con gái', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Husband', 'Chồng', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wife', 'Vợ', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Nephew', 'Cháu trai', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Niece', 'Cháu gái', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Father-in-law', 'Bố chồng/Bố vợ', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Mother-in-law', 'Mẹ chồng/Mẹ vợ', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Brother-in-law', 'Anh/Em rể', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sister-in-law', 'Chị/Em dâu', 'Noun', 3)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Family', 'Gia đình', 'Noun', 3)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Greetings')");
        // Chủ đề 4: Greetings (Chào hỏi) với loại từ ngữ pháp chuẩn
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hello', 'Xin chào', 'Interjection', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hi', 'Chào', 'Interjection', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Good morning', 'Chào buổi sáng', 'Phrase', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Good afternoon', 'Chào buổi chiều', 'Phrase', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Good evening', 'Chào buổi tối', 'Phrase', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('How are you?', 'Bạn khỏe không?', 'Question', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Nice to meet you', 'Rất vui được gặp bạn', 'Phrase', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Goodbye', 'Tạm biệt', 'Interjection', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('See you later', 'Hẹn gặp lại', 'Phrase', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Take care', 'Giữ gìn sức khỏe', 'Phrase', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('How do you do?', 'Chào bạn', 'Phrase', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('What’s up?', 'Có gì mới không?', 'Question', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Long time no see', 'Lâu rồi không gặp', 'Phrase', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Welcome', 'Chào mừng', 'Interjection', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('How have you been?', 'Bạn dạo này thế nào?', 'Question', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pleased to meet you', 'Rất hân hạnh được gặp bạn', 'Phrase', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Good night', 'Chúc ngủ ngon', 'Phrase', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bye', 'Tạm biệt', 'Interjection', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('See you soon', 'Gặp lại sớm nhé', 'Phrase', 4)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Have a nice day', 'Chúc một ngày tốt lành', 'Phrase', 4)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Character')");
        // Chủ đề 5: Character (Tính cách / Nhân vật)
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Friendly', 'Thân thiện', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Kind', 'Tốt bụng', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Honest', 'Trung thực', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Brave', 'Dũng cảm', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Polite', 'Lịch sự', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shy', 'Nhút nhát', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lazy', 'Lười biếng', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cheerful', 'Vui vẻ', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Generous', 'Hào phóng', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Selfish', 'Ích kỷ', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Clever', 'Thông minh', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Patient', 'Kiên nhẫn', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Talkative', 'Nói nhiều', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Quiet', 'Trầm lặng', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Angry', 'Tức giận', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Generous person', 'Người hào phóng', 'Noun', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Leader', 'Nhà lãnh đạo', 'Noun', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Friend', 'Người bạn', 'Noun', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Enemy', 'Kẻ thù', 'Noun', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hero', 'Anh hùng', 'Noun', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Villain', 'Nhân vật phản diện', 'Noun', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Optimistic', 'Lạc quan', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pessimistic', 'Bi quan', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Confident', 'Tự tin', 'Adjective', 5)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Caring', 'Quan tâm, chăm sóc', 'Adjective', 5)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('School')");
        // Chủ đề 6: School (Trường học)
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('School', 'Trường học', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Classroom', 'Phòng học', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Teacher', 'Giáo viên', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Student', 'Học sinh', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Principal', 'Hiệu trưởng', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Desk', 'Bàn học', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chair', 'Ghế', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Blackboard', 'Bảng đen', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Notebook', 'Vở', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pen', 'Bút', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pencil', 'Bút chì', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Eraser', 'Tẩy', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ruler', 'Thước kẻ', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Library', 'Thư viện', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Laboratory', 'Phòng thí nghiệm', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Exam', 'Kỳ thi', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Homework', 'Bài tập về nhà', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Uniform', 'Đồng phục', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Playground', 'Sân chơi', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('School bag', 'Cặp sách', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Canteen', 'Nhà ăn', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Whiteboard', 'Bảng trắng', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chalk', 'Phấn', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Projector', 'Máy chiếu', 'Noun', 6)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Student council', 'Hội học sinh', 'Noun', 6)");
        // Chủ đề 7: Fruits (Trái cây)

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Fruits')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Apple', 'Táo', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Banana', 'Chuối', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Orange', 'Cam', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Mango', 'Xoài', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Grapes', 'Nho', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Strawberry', 'Dâu tây', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pineapple', 'Dứa', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Watermelon', 'Dưa hấu', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cherry', 'Anh đào', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Peach', 'Đào', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pear', 'Lê', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lemon', 'Chanh', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Kiwi', 'Kiwi', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Plum', 'Mận', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Apricot', 'Mơ', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Coconut', 'Dừa', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Papaya', 'Đu đủ', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Guava', 'Ổi', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dragon fruit', 'Thanh long', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Raspberry', 'Mâm xôi', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Blueberry', 'Việt quất', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Blackberry', 'Mâm xôi đen', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pomegranate', 'Lựu', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fig', 'Sung', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lychee', 'Vải', 'Noun', 7)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tangerine', 'Quýt', 'Noun', 7)");
        // Chủ đề 8: Clothes (Quần áo)

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Clothes')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('T-shirt', 'Áo thun', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shirt', 'Áo sơ mi', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Jeans', 'Quần jean', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Trousers', 'Quần dài', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shorts', 'Quần đùi', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Skirt', 'Váy', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dress', 'Đầm', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Jacket', 'Áo khoác', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Coat', 'Áo choàng', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sweater', 'Áo len', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hoodie', 'Áo hoodie', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Blouse', 'Áo kiểu nữ', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Suit', 'Bộ vest', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tie', 'Cà vạt', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Belt', 'Thắt lưng', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hat', 'Mũ', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cap', 'Mũ lưỡi trai', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Scarf', 'Khăn quàng cổ', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Gloves', 'Găng tay', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Socks', 'Tất', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shoes', 'Giày', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Boots', 'Ủng', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sandals', 'Sandal', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Slippers', 'Dép lê', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Overcoat', 'Áo khoác dài', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Vest', 'Áo gile', 'Noun', 8)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Raincoat', 'Áo mưa', 'Noun', 8)");
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Health and Deases')");
        // Chủ đề 9: Health and Diseases (Sức khỏe và bệnh tật)
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Health', 'Sức khỏe', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Disease', 'Bệnh', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fever', 'Sốt', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cold', 'Cảm lạnh', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Flu', 'Cúm', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Headache', 'Đau đầu', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cough', 'Ho', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sore throat', 'Đau họng', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Diabetes', 'Bệnh tiểu đường', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Heart disease', 'Bệnh tim', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Allergy', 'Dị ứng', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Infection', 'Nhiễm trùng', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Injury', 'Chấn thương', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Vomiting', 'Nôn mửa', 'Verb', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fatigue', 'Mệt mỏi', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pain', 'Đau', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Healthy', 'Khỏe mạnh', 'Adjective', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hospital', 'Bệnh viện', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Doctor', 'Bác sĩ', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Nurse', 'Y tá', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pharmacy', 'Nhà thuốc', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Treatment', 'Điều trị', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Medicine', 'Thuốc', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Vaccination', 'Tiêm phòng', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Emergency', 'Cấp cứu', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Check-up', 'Khám sức khỏe', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Symptom', 'Triệu chứng', 'Noun', 9)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Recovery', 'Hồi phục', 'Noun', 9)");
        // Chủ đề jobs
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Jobs')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Job', 'Công việc', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Employee', 'Nhân viên', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Employer', 'Nhà tuyển dụng', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Position', 'Vị trí công việc', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Salary', 'Mức lương', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Interview', 'Phỏng vấn', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Career', 'Sự nghiệp', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Resume', 'Sơ yếu lý lịch', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Recruitment', 'Tuyển dụng', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Promotion', 'Thăng chức', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Jobseeker', 'Người tìm việc', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Full-time', 'Toàn thời gian', 'Adjective', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Part-time', 'Bán thời gian', 'Adjective', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Freelancer', 'Người làm tự do', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Intern', 'Thực tập sinh', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Employer branding', 'Xây dựng thương hiệu nhà tuyển dụng', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Job offer', 'Lời mời làm việc', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Workplace', 'Nơi làm việc', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Employee benefits', 'Phúc lợi cho nhân viên', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Work-life balance', 'Cân bằng công việc và cuộc sống', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Onboarding', 'Quá trình hòa nhập công ty', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Job description', 'Mô tả công việc', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Job satisfaction', 'Sự hài lòng trong công việc', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Training', 'Đào tạo', 'Noun', 10)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Employee retention', 'Giữ chân nhân viên', 'Noun', 10)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Bathroom')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Toothbrush holder', 'Giá cắm bàn chải đánh răng', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Beaker', 'Cốc, chén', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Mixer tap', 'Vòi nước hỗn hợp (để lấy cả nước nóng và nước lạnh)', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Washbasin', 'Chậu rửa, bồn rửa', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Soap dispenser', 'Bình xịt xà phòng', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Flannel (BrE)/washcloth (NAmE)', 'Vải flanen (để đánh bong, lau chùi)', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Vanity unit', 'Tủ gắn cố định với bồn rửa mặt trong phòng tắm', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shower cubicle', 'Buồng tắm gương sen', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shower head', 'Vòi hoa sen', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Soap dish', 'Khay xà phòng', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shower tray', 'Tấm đáy (của buồng tắm gương sen)', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Plughole (BrE)/drain (US)', 'Lỗ tháo nước', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Towel rail (BrE)/towel rack (NAmE)', 'Cái giá xoay để treo khăn mặt, khăn tắm', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hand towel', 'Khăn tay', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bath towel', 'Khăn tắm', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bathroom scales', 'Cân trong phòng tắm', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bath (BrE)/bathtub (especially NAmE)', 'Bồn tắm, chậu tắm', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bath mat', 'Thảm chùi chân trong phòng tắm', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sling', 'Sling', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bath panel', 'Thành bồn tắm', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tap (especially BrE)/faucet (NAmE)', 'Vòi nước', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bathrobe (or robe)', 'Áo choàng tắm', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Toilet', 'Bồn rửa phía dưới', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Toilet', 'Bồn cầu', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cistern (BrE)', 'Bể chứa nước bình chứa nước', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Toilet paper', 'Giấy vệ sinh', 'Noun', 11)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Toilet brush', 'Bàn chải cọ bồn cầu', 'Noun', 11)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Bedroom')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Clock radio', 'Ra-đi-ô có đồng hồ điện tử', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Headboard', 'Tấm ván đầu giường', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pillow', 'Gối', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pillowcase', 'Bao gối', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bottom sheet', 'Tấm trải giường', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Double bed', 'Giường đôi', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Duvet', 'Chăn lông vịt', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('En suite (BrE, from French)', 'Phòng khép kín', 'Adjective', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Built-in/fitted wardrobe (BrE)/closet (especially NAmE)', 'Tủ quần áo', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rail', 'Giá treo', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hanger', 'Cái móc', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chest of drawers (NAmE also bureau, dresser)', 'Tủ có ngăn kéo', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Drawer', 'Ngăn kéo', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Full-length mirror', 'Gương đứng được cả người', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Mirror', 'Gương', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dressing table (NAmE also vanity table)/vanity', 'Bàn trang điểm', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Stool', 'Ghế đẩu', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fitted carpet (BrE)/wall-to-wall carpet (NAmE)', 'Thảm trải kín sàn', 'Noun', 12)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rug', 'Tấm thảm', 'Noun', 12)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Living Room')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hi-fi system', 'Hệ thống âm thanh trung thực', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Speakers', 'Loa', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Waste-paper basket (BrE)/wastebasket (NAmE)', 'Thùng rác trong nhà', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Mantelpiece (also mantel, especially NAmE)', 'Máng lò sưởi', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Armchair', 'Ghế bành', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Seat cushion', 'Thùng đựng đệm than', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fire surround', 'Khung lò sưởi', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fireplace', 'Lò sưởi', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Gate', 'Cửa lò sưởi', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hearth', 'Nền lò sưởi', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Poker', 'Que cời (lửa)', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('House plant (BrE also pot plant)', 'Chậu cây trong nhà', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Plant pot', 'Chậu cây cảnh', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rug', 'Tấm thảm', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bookcase', 'Giá sách', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ornament (especially BrE)', 'Vật trang trí', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bookend', 'Cái chặn sách dựng', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Flat-screen TV', 'Tivi màn hình phẳng', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Vase', 'Lọ hoa', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Coaster', 'Cái lót cốc', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Footstool', 'Ghế để chân', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Coffee table', 'Bàn thấp đặt cùng bộ ghế sa-lôn', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Remote control', 'Điều khiển', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Radiator', 'Bộ tản nhiệt', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Magazine rack', 'Giá đựng tạp chí', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Recliner', 'Ghế tựa', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Scatter cushion (BrE)/throw pillow (NAmE)', 'Gối nhỏ để trang trí trên ghế sa-lôn', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sofa/couch', 'Ghế sa-lôn', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Occasional table (BrE also side table)', 'Bàn nhỏ để dùng thỉnh thoảng', 'Noun', 13)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Floorboards', 'Ván lát sàn', 'Noun', 13)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('DIY and cleaning')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rubber gloves', 'Găng tay cao su', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dustpan and brush', 'Xẻng hót rác và chổi', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Broom', 'Chổi (quét nhà)', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Mop', 'Cây lau nhà', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Vacuum cleaner', 'Máy hút bụi', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ironing board', 'Bàn để ủi đồ', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Iron', 'Bàn là / bàn ủi', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bucket (NAmE: pail)', 'Xô (thùng)', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sponge', 'Miếng bọt biển', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Feather duster', 'Chổi lông gà (phủi bụi)', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dishwashing detergent', 'Nước rửa chén / nước rửa bát', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Spirit level', 'Thước thủy', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bolt', 'Bu lông, chốt', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Nut', 'Đai ốc', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Washer', 'Vòng đệm', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Scissors', 'Kéo', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wrench (US) / Spanner (UK)', 'Cờ lê (mỏ lết)', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pliers', 'Kìm', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hammer', 'Búa', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Nail', 'Đinh', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Screwdriver', 'Tuốc-nơ-vít', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chisel', 'Đục', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Drill', 'Máy khoan', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Handsaw', 'Cưa tay', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Saw', 'Cưa', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Toolbox', 'Hộp dụng cụ', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Paint brush', 'Cọ sơn', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Roller', 'Con lăn sơn', 'Noun', 14)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ladder', 'Thang', 'Noun', 14)");


        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Garden ')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Greenhouse', 'Nhà kính', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shed', 'Kho chứa đồ', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hedge', 'Hàng rào cây', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bird table (BrE)/bird feeder (NAmE)', 'Bàn/khay đựng thức ăn cho chim', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Conservatory (BrE)', 'Nhà kính/Phòng kính trồng cây', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pergola', 'Khung giàn cho dây leo', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Parasol/sunshade', 'Mái che', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Climber', 'Cây dây leo', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Gate', 'Cổng', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fence', 'Hàng rào', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sunlounger (BrE) (also lounger, BrE)/deckchair (NAmE)', 'Ghế gương xếp', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Deckchair', 'Ghế rừng', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Barbecue (also BBQ)', 'Bếp nướng', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Water butt (BrE)/rain barrel (NAmE)', 'Thùng đựng nước mưa', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cane', 'Cây lau', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bench', 'Ghế dài', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Trellis', 'Hàng rào mắt cáo', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Slats', 'Cọc', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Deck', 'Sân trên', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Flowerpot', 'Chậu hoa', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Patio', 'Sân trong', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Planter', 'Chậu cây', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Flower bed', 'Chậu hoa', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Compost bin', 'Thùng phân bón', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Border', 'Đường/Lưỡng hoa', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lawn', 'Bãi cỏ', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Water feature', 'Yếu tố nước', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pond', 'Ao/Hồ', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Deck frame', 'Khung sân trên', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fence post', 'Cột hàng rào', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Seedling', 'Cây con', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shovel', 'Xẻng', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dibber', 'Cây trồng', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Spade', 'Xẻng (dạng bay)', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rake', 'Cào', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fork', 'Nĩa', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hoe', 'Cái cuốc', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Trowel', 'Bay nhỏ', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wheelbarrow', 'Xe cút kít', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Watering can', 'Bình tưới cây', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hosepipe', 'Vòi nước', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Secateurs', 'Kéo cắt cây', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lawnmower', 'Máy cắt cỏ', 'Noun', 15)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Vegetable patch/vegetable garden', 'Khu trồng rau', 'Noun', 15)");


        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('House')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chimney pot', 'Ống khói chụp trên ống khói', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chimney', 'Ống khói', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Aerial (BrE)/antenna', 'Ăng-ten', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Roof', 'Mái nhà', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Gable', 'Đầu hồi nhà', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Eaves', 'Mái hiên/Gờ mái', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Skylight', 'Cửa sổ ở mái nhà', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dormer window', 'Cửa sổ ở mái nhà', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Gutter', 'Máng nước, ống máng', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Downpipe (BrE)/downspout', 'Ống thoát nước', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shutter', 'Cửa chớp', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Windowpane', 'Ô kính cửa sổ', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sash window', 'Cửa sổ có hai khung kính trượt', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Casement window', 'Cửa sổ hai cánh', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Balcony', 'Ban công', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Window box', 'Bồn hoa cửa sổ', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Window sill', 'Bậu cửa sổ', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Porch', 'Cổng/Hiên', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Burglar alarm', 'Thiết bị báo trộm', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tiling', 'Ngói (lợp mái)', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hanging basket', 'Giỏ treo trang trí', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Door knocker', 'Vòng sắt gõ cửa', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Front door', 'Cửa trước', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('French window (BrE)/French door (NAmE)', 'Cửa kính và khung, cửa đôi ra hiên', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bay window', 'Cửa sổ nhô ra', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Letter box (BrE)/mail slot (NAmE)', 'Thùng thư (hộp thư mail)', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wall', 'Tường', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Back door', 'Cửa sau', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Garage', 'Ga-ra, chỗ để ô tô', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Door step', 'Bậc cửa', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Basement', 'Tầng hầm', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Steps', 'Bậc (thang)', 'Noun', 16)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Drive (also driveway)', 'Đường lái xe vào nhà', 'Noun', 16)");


        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Building')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Amphitheatre', 'Nhà hát vòng tròn, đài vòng', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fort', 'Pháo đài', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Palace', 'Cung điện', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Castle', 'Lâu đài', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Stately home', 'Ngôi nhà lớn ở nông thôn có giá trị lịch sử để khách tham quan', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Glasshouse', 'Nhà kính', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pyramid', 'Kim tự tháp', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Log cabin', 'Nhà làm bằng gỗ nguyên khối', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pub (BrE)', 'Quán rượu, tiệm rượu', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Warehouse', 'Kho hàng, kho chứa đồ', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lighthouse', 'Hải đăng, đèn biển', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Oil rig/oil platform', 'Giàn khoan dầu', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hut', 'Túp lều', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Barn', 'Kho thóc, chuồng gia súc', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pagoda', 'Chùa, tháp', 'Noun', 17)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Skyscraper', 'Nhà chọc trời', 'Noun', 17)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Architecture')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Arch', 'Vòm, cửa vòm', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dome', 'Mái vòm', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Minaret', 'Tháp nhọn', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pediment', 'Trán tường, chóp cột', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Column', 'Cột, cột trụ', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Statue', 'Tượng', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Gargoyle', 'Máng xối hình tượng', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Façade', 'Mặt tiền (công trình)', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Spire', 'Chóp nhọn', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Obelisk', 'Đài tưởng niệm', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Balcony', 'Ban công', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Portico', 'Cổng có mái che', 'Noun', 18)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tunnel', 'Hầm, đường hầm', 'Noun', 18)");


        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Bridges')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Viaduct', 'Cầu cạn', 'Noun', 19)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Suspension bridge', 'Cầu treo', 'Noun', 19)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Footbridge', 'Cầu đi bộ', 'Noun', 19)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lift bridge', 'Cầu nâng', 'Noun', 19)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pontoon bridge', 'Cầu phao', 'Noun', 19)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Drawbridge', 'Cầu rút', 'Noun', 19)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Arch bridge', 'Cầu vòm', 'Noun', 19)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cable-stayed bridge', 'Cầu dây văng', 'Noun', 19)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Truss bridge', 'Cầu giàn', 'Noun', 19)");



        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Coast')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Island', 'Hòn đảo, cù lao', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Headland/promontory', 'Mũi đất, đầu mũi', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bay (BrE)/cove (NAmE)', 'Vịnh, eo biển', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cliff', 'Vách đá (dựng đứng)', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cave', 'Hang động', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Beach', 'Bãi biển', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Harbour (BrE)/port (NAmE)', 'Hải cảng, bến cảng', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wharf (NAmE)', 'Bến tàu, bến cảng', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lighthouse', 'Hải đăng', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wave', 'Sóng', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Surf', 'Sóng vỗ bờ', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pier (BrE)', 'Cầu tàu, bến tàu', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Jetty (NAmE)', 'Đê chắn sóng, cầu tàu', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Seaweed', 'Rong biển', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rock pool (BrE)/tide pool (NAmE)', 'Hố đá nhỏ chứa nước khi triều xuống', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Seagull', 'Chim hải âu', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Shell', 'Vỏ sò, vỏ ốc', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sand', 'Cát', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ferry', 'Phà', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lifeboat', 'Thuyền cứu hộ', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Beacon', 'Hải đăng nhỏ (để báo hiệu)', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Liner', 'Tàu lớn', 'Noun', 20)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Yacht', 'Du thuyền', 'Noun', 20)");
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Literature')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Literature', 'Văn học', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Novel', 'Tiểu thuyết', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Poem', 'Bài thơ', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Poet', 'Nhà thơ', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Writer', 'Nhà văn', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Author', 'Tác giả', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Story', 'Câu chuyện', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Character', 'Nhân vật', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Plot', 'Cốt truyện', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chapter', 'Chương', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Title', 'Tiêu đề', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Quote', 'Trích dẫn', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fiction', 'Hư cấu', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Non-fiction', 'Phi hư cấu', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Drama', 'Kịch', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Playwright', 'Nhà viết kịch', 'Noun', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Read', 'Đọc', 'Verb', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Write', 'Viết', 'Verb', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Describe', 'Miêu tả', 'Verb', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Imagine', 'Tưởng tượng', 'Verb', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Beautiful', 'Đẹp, hay', 'Adjective', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Creative', 'Sáng tạo', 'Adjective', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Emotional', 'Giàu cảm xúc', 'Adjective', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Classic', 'Kinh điển', 'Adjective', 21)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Modern', 'Hiện đại', 'Adjective', 21)");
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Felling')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Happy', 'Hạnh phúc', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sad', 'Buồn', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Angry', 'Tức giận', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Excited', 'Phấn khích', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bored', 'Chán nản', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Scared', 'Sợ hãi', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Nervous', 'Lo lắng, hồi hộp', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Surprised', 'Ngạc nhiên', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Confused', 'Bối rối', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lonely', 'Cô đơn', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Proud', 'Tự hào', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Relaxed', 'Thư giãn', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tired', 'Mệt mỏi', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Satisfied', 'Hài lòng', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Jealous', 'Ghen tị', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hopeful', 'Đầy hy vọng', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Disappointed', 'Thất vọng', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Embarrassed', 'Xấu hổ', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Grateful', 'Biết ơn', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Afraid', 'Lo sợ', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Calm', 'Bình tĩnh', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Depressed', 'Trầm cảm', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Enthusiastic', 'Nhiệt tình', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Worried', 'Lo lắng', 'Adjective', 22)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Motivated', 'Có động lực', 'Adjective', 22)");
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Travel')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Travel', 'Du lịch', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Journey', 'Chuyến đi', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Trip', 'Chuyến du lịch ngắn', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Vacation', 'Kỳ nghỉ', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tour', 'Chuyến tham quan', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tourist', 'Khách du lịch', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Destination', 'Điểm đến', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Passport', 'Hộ chiếu', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Luggage', 'Hành lý', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Flight', 'Chuyến bay', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Airport', 'Sân bay', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ticket', 'Vé', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hotel', 'Khách sạn', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Resort', 'Khu nghỉ dưỡng', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Map', 'Bản đồ', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Adventure', 'Cuộc phiêu lưu', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Explore', 'Khám phá', 'Verb', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Guide', 'Hướng dẫn viên', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Souvenir', 'Quà lưu niệm', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Backpack', 'Ba lô', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cruise', 'Chuyến du thuyền', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Visa', 'Thị thực', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sightseeing', 'Tham quan', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Culture', 'Văn hóa', 'Noun', 23)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Landscape', 'Phong cảnh', 'Noun', 23)");
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Technology')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Technology', 'Công nghệ', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Computer', 'Máy tính', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Internet', 'Mạng Internet', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Software', 'Phần mềm', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hardware', 'Phần cứng', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Network', 'Mạng lưới', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Device', 'Thiết bị', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Smartphone', 'Điện thoại thông minh', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Application', 'Ứng dụng', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Robot', 'Người máy', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Artificial Intelligence', 'Trí tuệ nhân tạo', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Database', 'Cơ sở dữ liệu', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cloud', 'Đám mây', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Program', 'Chương trình', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Code', 'Mã lập trình', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Algorithm', 'Thuật toán', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Engineer', 'Kỹ sư', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Digital', 'Kỹ thuật số', 'Adjective', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cybersecurity', 'An ninh mạng', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Innovation', 'Sự đổi mới', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Upgrade', 'Nâng cấp', 'Verb', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Website', 'Trang web', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Data', 'Dữ liệu', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('System', 'Hệ thống', 'Noun', 24)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Virtual Reality', 'Thực tế ảo', 'Noun', 24)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Chirstmas')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Christmas', 'Lễ Giáng Sinh', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Santa Claus', 'Ông già Noel', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Reindeer', 'Tuần lộc', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sleigh', 'Xe trượt tuyết', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Gift', 'Món quà', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tree', 'Cây thông Noel', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Decoration', 'Trang trí', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bell', 'Chuông', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Candle', 'Nến', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Snow', 'Tuyết', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Snowflake', 'Bông tuyết', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Stocking', 'Vớ Giáng Sinh', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Present', 'Quà tặng', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chimney', 'Ống khói', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wish', 'Điều ước', 'Noun', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Celebrate', 'Ăn mừng', 'Verb', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Give', 'Tặng', 'Verb', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Receive', 'Nhận', 'Verb', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Decorate', 'Trang trí', 'Verb', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sing', 'Hát', 'Verb', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Joyful', 'Vui vẻ', 'Adjective', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Merry', 'Hạnh phúc, vui tươi', 'Adjective', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cold', 'Lạnh', 'Adjective', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Peaceful', 'Yên bình', 'Adjective', 25)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bright', 'Sáng sủa, rực rỡ', 'Adjective', 25)");


        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Sport')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sport', 'Thể thao', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Football', 'Bóng đá', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Basketball', 'Bóng rổ', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Volleyball', 'Bóng chuyền', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tennis', 'Quần vợt', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Badminton', 'Cầu lông', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Table Tennis', 'Bóng bàn', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Swimming', 'Bơi lội', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Running', 'Chạy bộ', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cycling', 'Đạp xe', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Boxing', 'Đấm bốc', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Baseball', 'Bóng chày', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Athlete', 'Vận động viên', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Coach', 'Huấn luyện viên', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Team', 'Đội, nhóm', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Competition', 'Cuộc thi đấu', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Champion', 'Nhà vô địch', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Goal', 'Bàn thắng, mục tiêu', 'Noun', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Score', 'Ghi điểm', 'Verb', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Win', 'Chiến thắng', 'Verb', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lose', 'Thua', 'Verb', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Practice', 'Luyện tập', 'Verb', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Strong', 'Mạnh mẽ', 'Adjective', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fast', 'Nhanh', 'Adjective', 26)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Healthy', 'Khỏe mạnh', 'Adjective', 26)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Music')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Music', 'Âm nhạc', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Song', 'Bài hát', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Singer', 'Ca sĩ', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Band', 'Ban nhạc', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Concert', 'Buổi hòa nhạc', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Melody', 'Giai điệu', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rhythm', 'Nhịp điệu', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lyrics', 'Lời bài hát', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Guitar', 'Đàn ghi-ta', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Piano', 'Đàn piano', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Drum', 'Trống', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Violin', 'Đàn vi-ô-lông', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Microphone', 'Micrô', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Composer', 'Nhà soạn nhạc', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Listen', 'Nghe', 'Verb', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sing', 'Hát', 'Verb', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Play', 'Chơi (nhạc cụ)', 'Verb', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dance', 'Nhảy múa', 'Verb', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Record', 'Thu âm', 'Verb', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Performance', 'Buổi biểu diễn', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Album', 'Tập nhạc, album', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pop', 'Nhạc pop', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rock', 'Nhạc rock', 'Noun', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Classical', 'Nhạc cổ điển', 'Adjective', 27)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Famous', 'Nổi tiếng', 'Adjective', 27)");
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Enviroment')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Environment', 'Môi trường', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Nature', 'Thiên nhiên', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pollution', 'Ô nhiễm', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Air Pollution', 'Ô nhiễm không khí', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Water Pollution', 'Ô nhiễm nguồn nước', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Deforestation', 'Phá rừng', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Recycling', 'Tái chế', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Waste', 'Chất thải', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Garbage', 'Rác', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Climate', 'Khí hậu', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Climate Change', 'Biến đổi khí hậu', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Global Warming', 'Sự nóng lên toàn cầu', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ecosystem', 'Hệ sinh thái', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Forest', 'Rừng', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wildlife', 'Động vật hoang dã', 'Noun', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Protect', 'Bảo vệ', 'Verb', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Reduce', 'Giảm thiểu', 'Verb', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Reuse', 'Tái sử dụng', 'Verb', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Recycle', 'Tái chế', 'Verb', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Save Energy', 'Tiết kiệm năng lượng', 'Verb', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Plant', 'Trồng cây', 'Verb', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Green', 'Xanh, thân thiện với môi trường', 'Adjective', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Clean', 'Sạch sẽ', 'Adjective', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dirty', 'Bẩn', 'Adjective', 28)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sustainable', 'Bền vững', 'Adjective', 28)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Education')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Education', 'Giáo dục', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('School', 'Trường học', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Teacher', 'Giáo viên', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Student', 'Học sinh, sinh viên', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Classroom', 'Lớp học', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lesson', 'Bài học', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Subject', 'Môn học', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Exam', 'Kỳ thi', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Homework', 'Bài tập về nhà', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Library', 'Thư viện', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Notebook', 'Vở ghi chép', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Knowledge', 'Kiến thức', 'Noun', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Learn', 'Học', 'Verb', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Study', 'Học tập', 'Verb', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Teach', 'Dạy học', 'Verb', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Read', 'Đọc', 'Verb', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Write', 'Viết', 'Verb', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pass', 'Vượt qua (kỳ thi)', 'Verb', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fail', 'Trượt (kỳ thi)', 'Verb', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Smart', 'Thông minh', 'Adjective', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hard-working', 'Chăm chỉ', 'Adjective', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Curious', 'Ham học hỏi', 'Adjective', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Boring', 'Nhàm chán', 'Adjective', 29)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Interesting', 'Thú vị', 'Adjective', 29)");



        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Conversation')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Conversation', 'Cuộc hội thoại', 'Noun', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Greeting', 'Lời chào', 'Noun', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Introduction', 'Giới thiệu', 'Noun', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Question', 'Câu hỏi', 'Noun', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Answer', 'Câu trả lời', 'Noun', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chat', 'Trò chuyện', 'Verb', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Talk', 'Nói chuyện', 'Verb', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Speak', 'Nói', 'Verb', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Listen', 'Lắng nghe', 'Verb', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ask', 'Hỏi', 'Verb', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Reply', 'Trả lời', 'Verb', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Discuss', 'Thảo luận', 'Verb', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Agree', 'Đồng ý', 'Verb', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Disagree', 'Không đồng ý', 'Verb', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Explain', 'Giải thích', 'Verb', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Interrupt', 'Ngắt lời', 'Verb', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Polite', 'Lịch sự', 'Adjective', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rude', 'Thô lỗ', 'Adjective', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Friendly', 'Thân thiện', 'Adjective', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Formal', 'Trang trọng', 'Adjective', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Informal', 'Thân mật, không trang trọng', 'Adjective', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Body Language', 'Ngôn ngữ cơ thể', 'Noun', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Smile', 'Nụ cười', 'Noun', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Gesture', 'Cử chỉ', 'Noun', 30)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Topic', 'Chủ đề', 'Noun', 30)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Season')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Season', 'Mùa', 'Noun', 31)");

        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Spring', 'Mùa xuân', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Summer', 'Mùa hè', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Autumn', 'Mùa thu', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fall', 'Mùa thu (từ dùng ở Mỹ)', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Winter', 'Mùa đông', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rainy season', 'Mùa mưa', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dry season', 'Mùa khô', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Snowy season', 'Mùa tuyết', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Harvest season', 'Mùa gặt', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Monsoon', 'Gió mùa', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wet season', 'Mùa ẩm ướt', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cold season', 'Mùa lạnh', 'Noun', 31)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hot season', 'Mùa nóng', 'Noun', 31)");
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Weather')");

        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Weather', 'Thời tiết', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sun', 'Mặt trời', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rain', 'Mưa', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Snow', 'Tuyết', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wind', 'Gió', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Storm', 'Bão', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Thunder', 'Sấm', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lightning', 'Chớp', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cloud', 'Mây', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fog', 'Sương mù', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Mist', 'Sương nhẹ', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Drizzle', 'Mưa phùn', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rainbow', 'Cầu vồng', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Temperature', 'Nhiệt độ', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Humidity', 'Độ ẩm', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Heatwave', 'Đợt nắng nóng', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Freeze', 'Sự đóng băng', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Frost', 'Sương giá', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hail', 'Mưa đá', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Breeze', 'Gió nhẹ', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Gale', 'Gió mạnh', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Drought', 'Hạn hán', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Flood', 'Lũ lụt', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hurricane', 'Bão lớn (ở Đại Tây Dương)', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Typhoon', 'Bão nhiệt đới (ở Thái Bình Dương)', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Blizzard', 'Bão tuyết', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sunshine', 'Ánh nắng mặt trời', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Raindrop', 'Giọt mưa', 'Noun', 32)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Forecast', 'Dự báo thời tiết', 'Noun', 32)");
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Vehicle')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Car', 'Xe hơi, ô tô', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bus', 'Xe buýt', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Motorbike', 'Xe máy', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bicycle', 'Xe đạp', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Train', 'Tàu hỏa', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Airplane', 'Máy bay', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Boat', 'Thuyền', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ship', 'Tàu thủy', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Helicopter', 'Trực thăng', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Subway', 'Tàu điện ngầm', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Taxi', 'Xe taxi', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Truck', 'Xe tải', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Van', 'Xe van', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Scooter', 'Xe tay ga', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ferry', 'Phà', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cable car', 'Cáp treo', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ambulance', 'Xe cứu thương', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fire truck', 'Xe cứu hỏa', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Police car', 'Xe cảnh sát', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Blimp', 'Khinh khí cầu', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Driver', 'Người lái xe', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Passenger', 'Hành khách', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Traffic jam', 'Kẹt xe', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Helmet', 'Mũ bảo hiểm', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Seat belt', 'Dây an toàn', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Gas station', 'Trạm xăng', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Traffic light', 'Đèn giao thông', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Crosswalk', 'Vạch qua đường', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Highway', 'Đường cao tốc', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Road', 'Con đường', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bridge', 'Cây cầu', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tunnel', 'Đường hầm', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Roundabout', 'Bùng binh, vòng xoay', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Bus stop', 'Trạm xe buýt', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Station', 'Nhà ga', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Harbor', 'Cảng', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Route', 'Tuyến đường', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pedestrian', 'Người đi bộ', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Traffic sign', 'Biển báo giao thông', 'Noun', 33)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Speed limit', 'Giới hạn tốc độ', 'Noun', 33)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Director')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('North', 'Phía Bắc', 'Noun', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('South', 'Phía Nam', 'Noun', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('East', 'Phía Đông', 'Noun', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('West', 'Phía Tây', 'Noun', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Northeast', 'Đông Bắc', 'Noun', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Northwest', 'Tây Bắc', 'Noun', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Southeast', 'Đông Nam', 'Noun', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Southwest', 'Tây Nam', 'Noun', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Left', 'Bên trái', 'Noun', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Right', 'Bên phải', 'Noun', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Straight ahead', 'Đi thẳng', 'Adverb', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Turn left', 'Rẽ trái', 'Verb', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Turn right', 'Rẽ phải', 'Verb', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Go straight', 'Đi thẳng', 'Verb', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Go back', 'Quay lại', 'Verb', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Nearby', 'Gần đây', 'Adverb', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Opposite', 'Đối diện', 'Adjective', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Next to', 'Bên cạnh', 'Preposition', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Behind', 'Phía sau', 'Preposition', 34)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('In front of', 'Phía trước', 'Preposition', 34)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Event')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Birthday', 'Sinh nhật', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wedding', 'Đám cưới', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Anniversary', 'Kỷ niệm', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Graduation', 'Lễ tốt nghiệp', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Festival', 'Lễ hội', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Concert', 'Buổi hòa nhạc', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Competition', 'Cuộc thi', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Meeting', 'Cuộc họp', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Party', 'Bữa tiệc', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ceremony', 'Buổi lễ', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Conference', 'Hội nghị', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Exhibition', 'Triển lãm', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Parade', 'Cuộc diễu hành', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fair', 'Hội chợ', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Opening ceremony', 'Lễ khai mạc', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Closing ceremony', 'Lễ bế mạc', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('New Year celebration', 'Lễ mừng năm mới', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Christmas party', 'Tiệc Giáng sinh', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Charity event', 'Sự kiện từ thiện', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sports day', 'Ngày hội thể thao', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cultural festival', 'Lễ hội văn hóa', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Music festival', 'Lễ hội âm nhạc', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fireworks show', 'Màn bắn pháo hoa', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Art exhibition', 'Triển lãm nghệ thuật', 'Noun', 35)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Public holiday', 'Ngày nghỉ lễ', 'Noun', 35)");
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Material')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Material', 'Chất liệu', 'Noun', 36)");

        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cotton', 'Vải bông, vải cotton', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Silk', 'Lụa', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wool', 'Len', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Leather', 'Da (chất liệu)', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Denim', 'Vải bò (vải jean)', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Polyester', 'Sợi tổng hợp (polyester)', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Velvet', 'Vải nhung', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Linen', 'Vải lanh', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Nylon', 'Sợi ni-lông', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fur', 'Lông thú', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Wood', 'Gỗ', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Metal', 'Kim loại', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Glass', 'Thủy tinh', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Ceramic', 'Gốm, sứ', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Paper', 'Giấy', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Plastic', 'Nhựa', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Stone', 'Đá', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Clay', 'Đất sét', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rubber', 'Cao su', 'Noun', 36)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Marble', 'Đá cẩm thạch', 'Noun', 36)");

        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Tree')");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Apple tree', 'Cây táo', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Mango tree', 'Cây xoài', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Banana tree', 'Cây chuối', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Coconut tree', 'Cây dừa', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cherry', 'Cây anh đào', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Orange tree', 'Cây cam', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lemon tree', 'Cây chanh', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Peach tree', 'Cây đào', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pear tree', 'Cây lê', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fig tree', 'Cây sung', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Oak', 'Cây sồi', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Pine', 'Cây thông', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Maple', 'Cây thích', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Birch', 'Cây bạch dương', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Willow', 'Cây liễu', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Fir', 'Cây thông tuyết', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Spruce', 'Cây thông vân sam', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cedar', 'Cây tuyết tùng', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Baobab', 'Cây bao báp', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Eucalyptus', 'Cây bạch đàn', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Banyan', 'Cây đa', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Magnolia', 'Cây mộc lan', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Palm', 'Cây cọ', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cherry blossom', 'Cây hoa anh đào', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Redwood', 'Cây gỗ đỏ', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sequoia', 'Cây tùng đỏ', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Dogwood', 'Cây hoa sữa', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Olive tree', 'Cây ô liu', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Cypress', 'Cây bách', 'Noun', 37)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Palm tree', 'Cây cọ cao', 'Noun', 37)");
        db.execSQL("INSERT INTO "+TABLE_TOPIC+"(name) VALUES ('Flowers')");
        // Chủ đề: Flowers – Hoa
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Rose', 'Hoa hồng', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Tulip', 'Hoa tulip', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lily', 'Hoa ly', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sunflower', 'Hoa hướng dương', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Daisy', 'Hoa cúc dại', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Orchid', 'Hoa lan', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Carnation', 'Hoa cẩm chướng', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Marigold', 'Hoa cúc vạn thọ', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Peony', 'Hoa mẫu đơn', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Chrysanthemum', 'Hoa cúc', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Jasmine', 'Hoa nhài', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lavender', 'Hoa oải hương', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Gardenia', 'Hoa lài tây', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Iris', 'Hoa diên vĩ', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Lotus', 'Hoa sen', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Camellia', 'Hoa trà', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hibiscus', 'Hoa dâm bụt', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Magnolia', 'Hoa mộc lan', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Poppy', 'Hoa anh túc', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Begonia', 'Hoa dạ yến thảo', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Hydrangea', 'Hoa cẩm tú cầu', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Freesia', 'Hoa phi yến', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Azalea', 'Hoa đỗ quyên', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Camomile', 'Hoa cúc La Mã', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Sweet pea', 'Hoa đậu thơm', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Snapdragon', 'Hoa mõm chó', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Violet', 'Hoa violet', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Anemone', 'Hoa anemone', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Daffodil', 'Hoa thủy tiên', 'Noun', 38)");
        db.execSQL("INSERT INTO " + TABLE_DICT + " (word, meaning, word_type, topic_id) VALUES ('Flower', 'Hoa', 'Noun', 38)");






















    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DICT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TOPIC);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        onCreate(db);
    }
}


