import React, {useState} from 'react';
import Button from '@mui/material/Button';
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';

export default function Modal(
  { title, openModal, closeModal, handleDelete }:
    { title: string, openModal: boolean, closeModal: void, handleDelete: Function }
  ) {

  return (
    <div>
      <Dialog
        open={openModal}
        onClose={closeModal}
        fullWidth={true}
        maxWidth={'sm'}
        aria-labelledby="alert-dialog-title"
        aria-describedby="alert-dialog-description"
      >
        <DialogTitle align='center'>
          {title}
        </DialogTitle>
        <DialogContent>
          <DialogContentText  align='center'>
            Gostaria de deletar essa obra?<br/>
            você perdera todas as informações relacionada a ela?
          </DialogContentText>
        </DialogContent>
        <DialogActions>
          <Button onClick={handleDelete}> Sim</Button>
          <Button onClick={closeModal} autoFocus>
            Não
          </Button>
        </DialogActions>
      </Dialog>
    </div>
  );
}