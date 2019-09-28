import React, { Component } from "react";
import Page1 from './Page1';
import Page2 from './Page2';
import Page3 from './Page3';
import Page4 from './Page4';
import { createAppContainer } from 'react-navigation';
import { createStackNavigator } from 'react-navigation-stack';

const AppNavigator = createStackNavigator(
    {
      Page1,
      Page2,
      Page3,
      Page4,
    },
    {
      initialRouteName: 'Page1',
    }
);

const AppContainer = createAppContainer(AppNavigator);

export default class App extends Component {
    render() {
        return (
            <AppContainer/>
        );
    }
}