package chineseweb

class Flashcard {
	String symbol
	String pronunciation
	String definition
	
	static scaffolding = true
	static belongsTo = Lesson
	static hasMany = [lessons: Lesson]
	
    static constraints = {
		symbol unique: true
		pronunciation nullable: false
		definition nullable: false
    }
}
