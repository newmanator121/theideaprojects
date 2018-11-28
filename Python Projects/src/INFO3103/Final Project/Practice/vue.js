var app = new Vue({
  // app initial state
  data: {
    todos: todoStorage.fetch(),
    newTodo: '',
    editList: null,
    removeList: 'all'
    editItem: null,
    removeItem: ''
    userName
  },









methods: {
    showItems() {
      this.$validator.validateAll().then((result) => {
        if (result) {
          this.skills.push({skill: this.skill})
          this.skill = '';
        } else {
          console.log('Not valid');
        }
      })
    },



