package Practice4_1.Task7;

class Main {
	public static void main(String[] args) {
		Learner[] learners = new Learner[]{
				new Schoolboy("Петя"),
				new Student("Вася")
		};

		for (Learner learner : learners) {
			if (learner instanceof Student)
				System.out.println(learner);
		}

		for (Learner learner : learners) {
			if (learner instanceof Schoolboy)
				System.out.println(learner);
		}


	}
}
